public class digitSumChallenge {
    public static void main(String[] args) {
        sumDigits(123);

    }

    public static void sumDigits(int num) {
    int sum = 0;
            String number = String.valueOf(num);
            for (int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                sum = sum + j;
                System.out.println("digit: " + j);



            }
        System.out.println("The total sum is " + sum);
        }
//public static void sumDigits(int number){
//int sum = 0;
//
//        while (number > 0){
//            sum+= number % 10;
//            number = number/10;
//
//
//            System.out.println(number);
//
//     }
//    System.out.println(sum);
//}
public static boolean isPalindrome(int number) {
    int reverse = 0;
    if (number != reverse) {
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

    }return true;
}
    }
