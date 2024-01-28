public class perfectNumber {
    public static void main(String[] args) {
        boolean result = isPerfectNumber(8128);
        System.out.println(result);
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }int sum = 0;
        for(int i = 1; i <= number / 2; i++ ){
            if(number % i == 0){
                sum+= i;
            }
        }return sum == number;
    }
}
//Absolutely! In the context of determining a perfect number, the difference between for (int i = 1; i <= number / 2; i++) and for (int i = number; i <= number; i++) lies
// in the range of values being iterated through to find the divisors.
////for (int i = 1; i <= number / 2; i++): This loop initializes i to 1 and iterates up to number / 2. It's based on the principle that divisors higher than number / 2 won't
// be proper divisors of number. For instance, if number is 28, you only need to check divisors up to 14 (28 / 2) since any divisor higher than this won't be a proper divisor of 28.
////for (int i = number; i <= number; i++): This loop initializes i to number and loops only once because the condition i <= number remains false after the first iteration. Consequently, it
// doesn't effectively iterate through any divisors to check for proper divisors of the given number. The loop condition isn't suitable for finding divisors.
////In finding perfect numbers, it's essential to iterate through the divisors starting from 1 up to number / 2 to efficiently find and sum up the proper divisors of the given number.