package com.easybytes.implementation;

import com.easybytes.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class NokiaSpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Nokia speaker";
    }
}
