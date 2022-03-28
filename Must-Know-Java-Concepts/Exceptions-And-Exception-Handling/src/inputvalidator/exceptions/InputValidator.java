package inputvalidator.exceptions;

import inputvalidator.exceptions.checked.InvalidInputException;
import inputvalidator.exceptions.unchecked.InvalidAgeException;
import inputvalidator.exceptions.unchecked.InvalidEmailException;
import inputvalidator.exceptions.unchecked.InvalidNameException;

/**
 * The purpose of this class is to process a given String input
 * in the format of "name:{name}-age:{age}-email:{email}"
 * For eg: "name:John-age:28-email:xyz@gmail.com"
 */
public class InputValidator {

    /**
     * The below method tries to parse the input string on the basis of the delimiter (-)
     * and returns an array of String
     * @param input -- the input string (Ex: "name:John-age:28-email:xyz@gmail.com")
     * @throws InvalidInputException -- is thrown in case the string is null or empty
     */
    private String[] parseInput(final String input) throws InvalidInputException {
        if (input == null || input.length() == 0) {
            throw new InvalidInputException("The given input is Invalid");
        }
        return input.split("-");
    }

    /**
     * The method below takes in the input String, internally calls its parser {@link #parseInput(String input)}
     * and validate each of Name, Age and Email separately
     * @param input - the input string
     * @throws InvalidInputException -- the checked exception thrown by {{@link #parseInput(String input)}} method
     * and bubbled up by the validator.
     *
     * Note: It also throws several runtime exceptions which are not detected at compile-time
     * hence they don't get added with the throws clause
     */
    public void validate(final String input) throws InvalidInputException {
        System.out.printf("Validating Input: %s\n\n", input);
        final String[] inputArray = parseInput(input);
        final String namePart = inputArray[0];
        final String agePart = inputArray[1];
        final String emailPart = inputArray[2];
        validateName(namePart);
        validateAge(agePart);
        validateEmail(emailPart);
    }

    private void validateName(final String namePart) {

        System.out.printf("Validating name: %s\n\n", namePart);
        if (namePart == null || namePart.length() <= 5) {
            throw new InvalidNameException("The name: " + namePart + " is of invalid length");
        }
        final String[] nameArr = namePart.split(":");
        final String name = nameArr[1];

        if (name == null || name.length() == 0) {
            throw new InvalidNameException("The name: " + name + " is invalid");
        }
    }

    private void validateAge(final String age) {

        System.out.printf("Validating age: %s\n\n", age);
        if (age == null || age.length() <= 4) {
            throw new InvalidAgeException("The age: " + age + " is of invalid length");
        }
        final String[] ageArr = age.split(":");
        if (ageArr[1] == null || ageArr[1].length() == 0) {
            throw new InvalidAgeException("The age: " + age + " is invalid");
        }
        final int ageInt = Integer.parseInt(ageArr[1]);
        if (!(ageInt >= 18 && ageInt <= 60)) {
            throw new InvalidAgeException("The given age: " + ageInt + " is invalid");
        }
    }

    private void validateEmail(final String email) {
        System.out.printf("Validating email: %s\n\n", email);
        if (email == null || email.length() == 0) {
            throw new InvalidEmailException("The email: " + email + " is of invalid length");
        }
        final String[] emailArr = email.split(":");
        if (emailArr[1] == null || emailArr[1].length() == 0 || !(emailArr[1].contains("@"))) {
            throw new InvalidEmailException("The email: " + email + " is invalid");
        }
    }
}
