package in.geekster.corefundamentals.containeranddependencyinjection;

public class ManualVoiceProcessor implements VoiceProcessor {

    public ManualVoiceProcessor() {
        VoiceProcessorRegistry.register(this, "manual");
    }

    @Override
    public Integer[] findDigitOcurrences(String voiceInput) {
        return new Integer[0];
    }
}
