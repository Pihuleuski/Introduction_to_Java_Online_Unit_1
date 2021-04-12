package by.epam.gomel.yandex.telmana2a;

import org.junit.Assert;
import org.junit.Test;

public class TestFork2 {

    @Test
    public void testFindMening(){
        Assert.assertEquals(new Fork2().findMening(1,2,3,4), 3);
    }

}


