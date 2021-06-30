package com.derman.test;

import org.junit.Assert;
import org.junit.Test;

public class BehandelingTest {

//    @Test
//    public void getPrijsTest() {
//        Behandeling behandeling = new Behandeling(0);
//        Assert.assertEquals(0.00, behandeling.getPrijs(), 0.01);
//
//        behandeling.setAantal(1);
//        Assert.assertEquals(10.00, behandeling.getPrijs(), 0.01);
//
//        behandeling.setAantal(2);
//        Assert.assertEquals(15.00, behandeling.getPrijs(), 0.01);
//
//        behandeling.setAantal(3);
//        Assert.assertEquals(19.00, behandeling.getPrijs(), 0.01);
//
//        behandeling.setAantal(4);
//        Assert.assertEquals(23.00, behandeling.getPrijs(), 0.01);
//    }

    @Test
    public void getPrijsMetLeeftijdTest() {
        Behandeling behandeling = new Behandeling(1);
        Assert.assertEquals(10.00, behandeling.getPrijs(1, true), 0.01);
        Assert.assertEquals(4.00, behandeling.getPrijs(1, false), 0.01);

        Assert.assertEquals(10.00, behandeling.getPrijs(6, true), 0.01);
        Assert.assertEquals(4.00, behandeling.getPrijs(6, false), 0.01);

        Assert.assertEquals(7.00, behandeling.getPrijs(7, true), 0.01);
        Assert.assertEquals(2.00, behandeling.getPrijs(7, false), 0.01);

        Assert.assertEquals(7.00, behandeling.getPrijs(14, true), 0.01);
        Assert.assertEquals(2.00, behandeling.getPrijs(14, false), 0.01);

        Assert.assertEquals(5.00, behandeling.getPrijs(15, true), 0.01);
        Assert.assertEquals(0.00, behandeling.getPrijs(15, false), 0.01);

        Assert.assertEquals(5.00, behandeling.getPrijs(16, true), 0.01);
        Assert.assertEquals(0.00, behandeling.getPrijs(16, false), 0.01);
    }

}
