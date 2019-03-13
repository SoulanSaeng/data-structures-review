package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {

    @Test
    public void testEditDistance(){

        String a = "zoologicoarchaeologist";
        String b = "zoogeologist";

        EditDistance edit = new EditDistance();
        int dist = edit.minDistance(a,b);
        Assert.assertEquals(10, dist);
    }
}
