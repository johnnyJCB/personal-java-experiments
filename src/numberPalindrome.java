public class numberPalindrome {
    public static void main(String[] args) {
        isPalindrome(25);
//boolean rsult = isPalindrome(10);
//        System.out.println(rsult);
    }

    public static void isPalindrome(int number) {
        int reverse = 0;
        int original= number;
        System.out.println("original number is " + number);
//        int lastDigit = number % 10;
//        number = number/10;
        if (original != reverse) {
            while (number != 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number = number / 10;
//            System.out.println(reverse);
//            System.out.println(reverse);
//            if (number == reverse) {
//                System.out.println(number);
            }
            System.out.println(original);

        }
    }
}