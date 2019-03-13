package arrays;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void test(){
        String palindrome = "babad";
        LongestPalindromicSubstring palin = new LongestPalindromicSubstring();
        String result = palin.longestPalindrome(palindrome);
        Assert.assertEquals(result, "aba");
    }
}
