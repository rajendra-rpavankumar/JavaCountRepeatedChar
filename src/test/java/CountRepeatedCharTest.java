import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 29/04/2017.
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

}