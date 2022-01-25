package com.tsi.sam.brierley.animalstesting;

import com.tsi.sam.brierley.animals.DomesticCat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomesticCatTest {
    @Test
    public void test_domestic_cat_getName(){
        DomesticCat testDomCat = new DomesticCat();
        testDomCat.getDomesticCatName();
        assertEquals("Dennis", testDomCat.getDomesticCatName(),
                "The expected name of the domestic cat is wrong");
    }

    @Test
    public void test_domestic_cat_name(){
        DomesticCat testDomCat = new DomesticCat();
        testDomCat.setDomesticCatName("Elsie");
        assertEquals("Elsie", testDomCat.getDomesticCatName(),
                "The expected name of the domestic cat is wrong");
    }
}
