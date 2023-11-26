package model;

import Factory.SpeakerFactory;
import Factory.TyreFactory;
import Interface.Speaker;
import Interface.Tyre;
import speaker.JapanSpeaker;
import speaker.SonySpeaker;
import speaker.ThaiLanSpeaker;
import tire.AmericanTire;
import tire.KoreanTire;
import tire.ThaiLanTire;

import java.security.KeyPair;


public class Vehicle {

      public void makeVehicle(){
          ThaiLanSpeaker thaiLanSpeaker = new ThaiLanSpeaker();
          System.out.println(thaiLanSpeaker.makeSound());
          ThaiLanTire thaiLanTire = new ThaiLanTire();
          System.out.println(thaiLanTire.rotate());
    }

    public void makeVehicle2(){
        SpeakerFactory speakerFactory = new SpeakerFactory();
        Speaker speaker = speakerFactory.getSpeaker("THAILAN");
        System.out.println(speaker.makeSound());

        TyreFactory tyreFactory = new TyreFactory();
        Tyre tyre = tyreFactory.getTyre("KOREAN");
        System.out.println(tyre.rotate());
    }
}
