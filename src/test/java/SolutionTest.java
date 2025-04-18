import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void countAndSayTest1(){
        Assert.assertEquals("1", new Solution().countAndSay(1));
    }

    @Test
    public void countAndSayTest2(){
        Assert.assertEquals("1211", new Solution().countAndSay(4));
    }


}
