import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowerTest {
    @Parameterized.Parameters(name = "{index}: pow({0}, {1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 3, 8},
                {4, 2, 16},
                {-3, 3, -27},
                {-5, 4, 625},
                {0, 2, 0},
                {3, 0, 1},
                {-5, 0, 1},
                {0, 0, 1},
                {4, -1, 1},
                {-5, -2, 1},
                {0, -2, 1},
                {3, 31, 1264544299},
                {-5, 19, 463433411}
        });
    }

    @Parameterized.Parameter(0)
    public int numberValue;

    @Parameterized.Parameter(1)
    public int powValue;

    @Parameterized.Parameter(2)
    public int expected;

    @Test
    public void testPow(){
        Power power = new Power();
        Assert.assertEquals(expected, power.pow(numberValue, powValue));
    }

}