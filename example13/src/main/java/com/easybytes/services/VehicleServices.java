package com.easybytes.services;

import com.easybytes.interfaces.Speakers;
import com.easybytes.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    @Qualifier("sonySpeaker")
    private Speakers speakers;

    private Tyres tyres;
    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void movingVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }




}
