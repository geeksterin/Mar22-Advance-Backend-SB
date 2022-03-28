package in.geekster.corefundamentals.containeranddependencyinjection;

public class Main {

    public static void main(String[] args) {
        VoiceBox voiceBox = new VoiceBox();
//        voiceBox.process(new ManualVoiceProcessor());
        voiceBox.process(new AutomatedVoiceProcessor());
    }
}
