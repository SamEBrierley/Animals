package com.tsi.sam.brierley.animalstesting;
import com.tsi.sam.brierley.animals.DomesticCat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    public void test_Domestic_Cat_getName(){
        DomesticCat testDomCat = new DomesticCat();
        testDomCat.getDomesticCatName();
        assertEquals("Dennis", testDomCat.getDomesticCatName(), "The expected name of the domestic cat is wrong");
    }


}
