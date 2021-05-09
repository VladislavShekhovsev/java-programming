package SelfPractice.AprilFourth;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(112%1);
        System.out.println(112%10);// %10 always will give the last position (number) = 2
        System.out.println(110%100);// %100 will always give the second number from last
        System.out.println(isPalindromeExample(12321));
        System.out.println(isPalindrome(123454321));


    }
    public static boolean isPalindromeExample(int number){
       // System.out.println();
        while (number !=0){
            System.out.println("last digit: "+number%10); // to find the last number
            number/=10; // to delete the last number
            System.out.println("number after /10: "+number);
            System.out.println();
        }
        return false;
    }
    public static boolean isPalindrome(int number){
        int reverse = 0; // 43
        int temp = number; // 123

        while (temp != 0) {

            int lastDigit = temp % 10; // 3
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            // System.out.println(reverse);
        }
        return reverse == number;
    }

}
