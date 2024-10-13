package org.hbrs.se1.ws24.exercises.uebung1.control;

public class Factory {

    public static Translator ceategermanTranslator (){

        GermanTranslator germanTranslator = new GermanTranslator();
        germanTranslator.setDate("10.10.2024");

        return germanTranslator;
    }

}
