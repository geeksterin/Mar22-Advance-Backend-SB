package lambdas;

public class Main {

    public static void main(String[] args) {

        final Runnable runnable = () -> {
            System.out.println("Running Runnable");
        };

        final String voiceInput = "Hey There";
        final VoiceProcessor voiceProcessor = (input) -> {
            System.out.println("This is the Voice Processor: " + voiceInput);
        };

        final VoiceBox voiceBox = new VoiceBox();
        voiceBox.process(voiceProcessor, voiceInput);

        voiceBox.process((str) -> System.out.println("This is a different kind of lambda: " + str), "TEXTETEXTSTTE");
    }
}
