package com.tsi.sam.brierley.animals;

public class Penguin extends Bird{
    ////////////Attributes////////




    /////////Constructor///////////////
    public Penguin(){
        setWeight(5000);
    }

    /////////Methods////////////////////////////
    public String breathe(){
        return "I am Breathing";
    }
    public void eat(){
        setWeight(getWeight()+250);
    }
}
