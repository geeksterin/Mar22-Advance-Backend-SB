package lambdas;

@FunctionalInterface
public interface VoiceProcessor {

    void processVoice(final String voiceInputString);
}
