package com.tsi.sam.brierley.animals;

public abstract class Animal {
    ///////////////////Attributes///////////////////////
    private int age;
    private int weight;

    ///////////////////Constructors//////////////////////



    ///////////////////Methods//////////////////////////
    public void defecate(){
        setWeight(getWeight()-(getWeight()/10));
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
