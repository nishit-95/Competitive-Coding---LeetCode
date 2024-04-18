
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String s = Integer.toString(x); 
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        
        while(start < end) {
            if(ch[start] != ch[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        PalindromeNumber PalindromeNumber = new PalindromeNumber();
        
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        
        System.out.println(num1 + " is a palindrome: " + PalindromeNumber.isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + PalindromeNumber.isPalindrome(num2));
        System.out.println(num3 + " is a palindrome: " + PalindromeNumber.isPalindrome(num3));
    }
}

