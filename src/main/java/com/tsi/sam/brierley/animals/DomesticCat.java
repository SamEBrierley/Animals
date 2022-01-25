package com.tsi.sam.brierley.animals;

public class DomesticCat extends Cat {
    ////////////////////////Attributes////////////////////////
    private String petCatName;


    ///////////////////////Constructor////////////////////////
    public DomesticCat(){
        petCatName = "Dennis";
    }

    //////////////////////Methods/////////////////////////////
    public String getDomesticCatName(){
        return petCatName;
    }

    public void setDomesticCatName(String petName){
        petCatName = petName;
    }

}
