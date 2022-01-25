package com.tsi.sam.brierley.animals;

public class DomesticCat extends Cat {
    ////////////////////////Attributes////////////////////////
    private String petCatName;

    ///////////////////////Constructor////////////////////////
    public DomesticCat(){
        petCatName = "Dennis";
        setWeight(1000);
        setAge(5);
    }

    //////////////////////Methods/////////////////////////////
    public String getDomesticCatName(){
        return petCatName;
    }

    public void setDomesticCatName(String petName){
        petCatName = petName;
    }

}
