package com.tsi.sam.brierley.animalstesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.tsi.sam.brierley.animals.Cat;

public class TestAnimal {
    @Test
    public void test_set_age(){
        Cat testCat = new Cat();
        testCat.setAge(13);
        assertEquals(13, testCat.getAge(),"The expected age of the cat was wrong");
    }
}
