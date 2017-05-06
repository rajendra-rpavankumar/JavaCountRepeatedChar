import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Pavan Kumar on 29/04/2017.
 */
public class CountRepeatedCharTest {
    CountRepeatedChar countchar;

    @Before
    public void setUp() throws Exception {
        countchar=new CountRepeatedChar();
    }

    @Test
    public void countCharType() throws Exception {
        Assert.assertEquals("a4b3c2d2",countchar.countCharType("aaaabbbccdd"));
    }

    @Test
    public void countCharType2() throws Exception {
        Assert.assertEquals("a3b2c2d1",countchar.countCharType("aaabbccd"));
    }

    @Test
    public void countCharType3() throws Exception {
        Assert.assertEquals("a1b1c1", countchar.countCharType("abc"));
    }

    @Test
    public void countCharType4() throws Exception {
        Assert.assertEquals("a1", countchar.countCharType("a"));
    }

}