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
    public void eat(){
        setWeight(getWeight()+10);
    }


    public String takeoff(){
        flightStatus = "Running for take off";
        return flightStatus;
    }

    public String flight(){
        flightStatus = "Soaring Majestically";
        return flightStatus;
    }

    public String landing(){
        flightStatus = "Stops flapping and glides for landing";
        return flightStatus;
    }
}
