package com.tsi.sam.brierley.animalstesting;


import com.tsi.sam.brierley.animals.Cat;

public class TestAnimal {
    @Test
    public void test_set_age(){
        Cat testCat = new Cat();
        testCat.setAge(13);
        assertEquals(13, testCat.getAge(),"The expected age of the cat was wrong");
    }
}
