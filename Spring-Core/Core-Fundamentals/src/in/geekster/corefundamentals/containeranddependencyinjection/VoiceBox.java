package in.geekster.corefundamentals.containeranddependencyinjection;

public class VoiceBox {

    void process(final VoiceProcessor voiceProcessor) {
        // Implement logic
    }

    void process2() {
        final VoiceProcessor voiceProcessor = VoiceProcessorRegistry.getProcessor("manual");
    }
}
