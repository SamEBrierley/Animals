package com.tsi.sam.brierley.animalstesting;

import com.tsi.sam.brierley.animals.Penguin;
import com.tsi.sam.brierley.animals.Toucan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {

    @Test
    public void test_penguin_breath(){
        Penguin testPenguin = new Penguin();
        testPenguin.breathe();
        assertEquals("I am Breathing", testPenguin.breathe(),
                "The expected state of the Penguin breathing was wrong");
    }

    @Test
    public void test_set_weight(){
        Penguin testPenguin = new Penguin();
        testPenguin.setWeight(6000);
        assertEquals(6000, testPenguin.getWeight(),
                "The expected weight of the Penguin was wrong");
    }

    @Test
    public void test_get_weight(){
        Penguin testPenguin = new Penguin();;
        testPenguin.getWeight();
        assertEquals(5000, testPenguin.getWeight(),
                "The expected weight of the Penguin was wrong");
    }

    @Test
    public void test_toucan_eat(){
        Penguin testPenguin = new Penguin();;
        testPenguin.eat();
        assertEquals(5250, testPenguin.getWeight(),
                "The expected weight of the Penguin was not expected");
    }

    @Test
    public void test_penguin_defecate(){
        Penguin testPenguin = new Penguin();;
        testPenguin.defecate();
        assertEquals(4500, testPenguin.getWeight(),
                "The expected weight of the Penguin was wrong");
    }

}
