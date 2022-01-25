package com.tsi.sam.brierley.animalstesting;
import com.tsi.sam.brierley.animals.Cat;
import com.tsi.sam.brierley.animals.Toucan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToucanTest {

    @Test
    public void test_toucan_breath(){
        Toucan testToucan = new Toucan();
        testToucan.breathe();
        assertEquals("I am Breathing", testToucan.breathe(),
                "The expected state of the toucan breathing was wrong");
    }

    @Test
    public void test_set_weight(){
        Toucan testToucan = new Toucan();
        testToucan.setWeight(400);
        assertEquals(400, testToucan.getWeight(),
                "The expected weight of the toucan was wrong");
    }

    @Test
    public void test_get_weight(){
        Toucan testToucan = new Toucan();
        testToucan.getWeight();
        assertEquals(400, testToucan.getWeight(),
                "The expected weight of the toucan was wrong");
    }

    @Test
    public void test_toucan_eat(){
        Toucan testToucan = new Toucan();
        testToucan.eat("Seeds");
        assertEquals(410, testToucan.getWeight(),
                "The expected weight of the toucan was not expected");
    }

    @Test
    public void test_toucan_defecate(){
        Toucan testToucan = new Toucan();
        testToucan.defecate();
        assertEquals(360, testToucan.getWeight(),
                "The expected weight of the cat was wrong");
    }

    @Test
    public void test_toucan_takeoff(){
        Toucan testToucan = new Toucan();
        testToucan.takeoff();
        assertEquals("Running for take off", testToucan.takeoff(),
                "The expected flight status is wrong");
    }

    @Test
    public void test_toucan_flight(){
        Toucan testToucan = new Toucan();
        testToucan.flight();
        assertEquals("Soaring Majestically", testToucan.flight(),
                "The expected flight status is wrong");
    }

    @Test
    public void test_toucan_landing(){
        Toucan testToucan = new Toucan();
        testToucan.landing();
        assertEquals("Stops flapping and glides for landing", testToucan.landing(),
                "The expected flight status is wrong");
    }
}
