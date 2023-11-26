package Factory;

import Interface.Speaker;
import speaker.JapanSpeaker;
import speaker.SonySpeaker;
import speaker.ThaiLanSpeaker;

public class SpeakerFactory {
    public Speaker getSpeaker(String speakerType){
        if(speakerType == null){
            return null;
        }
        if(speakerType.equalsIgnoreCase("SONY")){
            return new SonySpeaker();
        }else if (speakerType.equalsIgnoreCase("JAPAN")){
            return new JapanSpeaker();
        } else if (speakerType.equalsIgnoreCase("THAILAN")) {
            return  new ThaiLanSpeaker();
        }
        return null;
    }
}
