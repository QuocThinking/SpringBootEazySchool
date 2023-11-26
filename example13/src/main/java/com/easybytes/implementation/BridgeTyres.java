package com.easybytes.implementation;

import com.easybytes.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with Bridge tyres";
    }
}
