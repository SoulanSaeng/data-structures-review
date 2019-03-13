package arrays;

public class LongestPalindromicSubstring {

    int low = 0;
    int max = 0;
    public String longestPalindrome(String s) {

        int len = s.length();

        if(len < 2){
            return s;
        }

        for(int i = 0 ; i < len - 1 ; i++){
            doStuff(s, i, i);
            doStuff(s, i, i+ 1);
        }

        return s.substring(low, low + max);
    }

    private void doStuff(String s, int i, int j){

        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i --;
            j ++;
        }

        if(max < j - i - 1 ) {
            low = i + 1;
            max = j - i -1;
        }
    }
}
