package com.tsi.sam.brierley.animalstesting;
import com.tsi.sam.brierley.animals.Toucan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToucanTest {

    @Test
    public void test_toucan_breath(){
        Toucan testToucan = new Toucan();
        testToucan.breathe();
        assertEquals("I am Breathing", testToucan.breathe(), "The expected state of the tucan breathing was wrong");
    }
}
