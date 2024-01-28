public class firstAndLastDigitSum {
    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(8475);
        System.out.println(result);
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstNumber = 0;
        int lastNumber = 0;
        lastNumber = number % 10;
        if (number >= 0) {
            while (number != 0) {
                firstNumber = number % 10;
                number /= 10;

            }
            return firstNumber + lastNumber;
        }return -1;
    }
    }
