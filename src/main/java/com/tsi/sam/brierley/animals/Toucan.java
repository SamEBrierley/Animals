package com.tsi.sam.brierley.animals;

public class Toucan extends Bird implements Flying{
    /////////////////////////Attributes//////////////////////////////////





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

    }

    public void flight(){

    }

    public void landing(){

    }
}
