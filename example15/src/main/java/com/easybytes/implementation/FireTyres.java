package com.easybytes.implementation;

import com.easybytes.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FireTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with Fire tyres";
    }
}
