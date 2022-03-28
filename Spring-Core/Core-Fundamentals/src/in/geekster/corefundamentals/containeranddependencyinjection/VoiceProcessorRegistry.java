package in.geekster.corefundamentals.containeranddependencyinjection;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VoiceProcessorRegistry {

    private static final Map<String, VoiceProcessor> REGISTRY = new HashMap<>();

    // Register a voice processor
    public static void register(final VoiceProcessor voiceProcessor, final String processorName) {
        REGISTRY.put(processorName, voiceProcessor);
    }

    // Retrieves a voice processor
    public static VoiceProcessor getProcessor(final String processorName) {
        return REGISTRY.getOrDefault(processorName, null);
    }

    public static Optional<VoiceProcessor> getProcessorSafely(final String processorName) {
        final VoiceProcessor vp = REGISTRY.getOrDefault(processorName, null);
        return Optional.ofNullable(vp);
    }
}
