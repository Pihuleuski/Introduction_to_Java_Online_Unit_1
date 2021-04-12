package by.epam.gomel.trening;

import by.epam.gomel.trening.Expression;
import by.epam.gomel.trening.Settings;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestExpression {
    private double a;
    private double b;
    private double c;
    private double z;

    public TestExpression(double a, double b, double c, double z) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = z;
    }

    @Parameterized.Parameters
    public static Collection addedNumbers(){
        return Arrays.asList(new Double[][] { {1.1, 2.2, 3.3, 1.21}, {1.0, 2.0, 3.0, 1.0},
                {2.4, 4.5, 6.7, 5.35}, });
    }

    @Test
    public void testFindExpression(){
        Assert.assertEquals(new Expression().findExpression(new Settings(a, b, c)), z, 0.0001);
    }
}
