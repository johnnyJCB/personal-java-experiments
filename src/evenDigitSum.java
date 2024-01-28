public class evenDigitSum {
    public static void main(String[] args) {
        int result = getEvenDigitSum(2468);
        System.out.println(result);
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            for (int i = number; i > 0; i /= 10) {
                int lastNumber = i % 10;
                if (lastNumber % 2 == 0) {
                    sum = sum + lastNumber;
                }
            }
            return sum;
        }return -1;
    }
}