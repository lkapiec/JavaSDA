package sdamaven.calculator;

import org.junit.Assert;
import org.junit.Test;

public class RevertTest {

    @Test
    public void dajOstatnia() {

        //giveng

        String rekursja = "ALA MA KOTA";
        Revert r = new Revert();

        String result = r.dajOstatnia(rekursja);

        Assert.assertEquals("ATOK AM ALA", result);


        //when
        //then

    }
}