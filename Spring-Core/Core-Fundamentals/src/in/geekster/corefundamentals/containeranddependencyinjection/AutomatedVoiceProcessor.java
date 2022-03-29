package in.geekster.corefundamentals.containeranddependencyinjection;

public class AutomatedVoiceProcessor implements VoiceProcessor {

    public AutomatedVoiceProcessor() {
        VoiceProcessorRegistry.register(this, "auto");
    }

    @Override
    public Integer[] findDigitOcurrences(String voiceInput) {
        return new Integer[0];
    }
}
