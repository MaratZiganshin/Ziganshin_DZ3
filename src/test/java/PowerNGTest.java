import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerNGTest {
    @DataProvider(name = "Pow")
    public static Object[][] pow() {
        return new Object[][] {
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
        };
    }
    @Test(dataProvider = "Pow")
    public void testPow(final int numberValue, final int powValue, final int expected){
        Power power = new Power();
        Assert.assertEquals(power.pow(numberValue, powValue), expected);
    }

}