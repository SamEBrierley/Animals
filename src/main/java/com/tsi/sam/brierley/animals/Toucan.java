package com.tsi.sam.brierley.animals;

public class Toucan extends Bird implements Flying{
    /////////////////////////Attributes//////////////////////////////////
    private String flightStatus;

    //////////////////////////////Constructors/////////////////////////
    public Toucan(){
        setWeight(400);
    }

    //////////////////////////Methods////////////////////////////
    public String breathe(){
        return "I am Breathing";
    }
    public void eat(String food){
        setWeight(getWeight()+10);
    }

    public void takeoff(){
        flightStatus = "Running for take off";
    }

    public void flight(){
        flightStatus = "Soaring Majestically";
    }

    public void landing(){
        flightStatus = "Stops flapping and glides for landing";
    }
}
