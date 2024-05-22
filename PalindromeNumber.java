
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            String s = String.valueOf(x);
            char[] c = s.toCharArray();

            int left = 0;
            int right = c.length -1;

            while(left<right){
                if(c[left] != c[right]){
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
    
}

