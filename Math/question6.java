package Math;

public class question6 {
    public static boolean checkPalindrome(int x){
        if( x < 0) return false;
        int rev = 0;
        int number = x;

        while(x > 0){
            int d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }
        return number == rev;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(12121));
    }
}
