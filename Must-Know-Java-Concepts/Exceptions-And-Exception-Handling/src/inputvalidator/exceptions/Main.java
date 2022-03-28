package inputvalidator.exceptions;

import inputvalidator.exceptions.checked.InvalidInputException;
import inputvalidator.exceptions.unchecked.InvalidAgeException;
import inputvalidator.exceptions.unchecked.InvalidNameException;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        final InputValidator inputValidator = new InputValidator();

        final String input1 = "name:John Doe-age:30-email:xyz@gmail.com";
        final String input2 = "name:-age:30-email:xyz@gmail.com";

        /**
         * Handling Compile Time Exception in single try-catch
         */
        try {
            inputValidator.validate(input1);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }

        /**
         * Use of multi-catch
         */
        try {
            inputValidator.validate(input2);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        } catch (InvalidNameException e) {
            System.err.println("Found invalid name");
            e.printStackTrace();
        }
    }
}
