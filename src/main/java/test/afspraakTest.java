package test;

import org.junit.Assert;
import org.junit.Test;

public class afspraakTest {

    @Test
    public void afspraakAanmakenTest() {
        Afspraak afspraak = new Afspraak("derman");
        Assert.assertEquals("derman", afspraak.getNaam());
    }

    @Test
    public void confirmTest() {
        Afspraak test_afspraak = new Afspraak("derman");
        Assert.assertFalse(test_afspraak.confirm());

        test_afspraak = new Afspraak("derman", "dd@dd.nl");
        Assert.assertTrue(test_afspraak.confirm());

        test_afspraak = new Afspraak("derman", "0612345678");
        Assert.assertTrue(test_afspraak.confirm());
    }

}
