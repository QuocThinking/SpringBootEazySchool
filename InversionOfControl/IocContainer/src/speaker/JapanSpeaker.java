package speaker;

import Interface.Speaker;

public class JapanSpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "Japan sound  working";
    }
}
