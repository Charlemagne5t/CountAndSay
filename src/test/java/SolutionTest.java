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

    @Test
    public void helper1Test(){
//        List<int[]> list = List.of(new int[]{2,2}, new int[]{2,3}, new int[]{1,1}, new int[]{5,4}, new int[]{2,1});
        Assert.assertEquals("2223115421", new Solution().createString(new Solution().stringToCountArray("223314444411")));
    }
}
