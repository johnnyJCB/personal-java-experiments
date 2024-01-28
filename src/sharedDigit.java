public class sharedDigit {
    public static void main(String[] args) {
hasSharedDigit(12, 42);
    }
    public static void hasSharedDigit(int a, int b){
        if((a >= 10 && a <= 99) && (b >= 10 && b <= 99)){
            int firstLeftDigit = a / 10;
            int firstRightDigit = a % 10;
            int secondLeftDigit = b / 10; // Extract left digit of second number
            int secondRightDigit = b % 10; // Extract right digit of second number
            System.out.println(firstLeftDigit == secondLeftDigit ||
                    firstLeftDigit == secondRightDigit ||
                    firstRightDigit == secondLeftDigit ||
                    firstRightDigit == secondRightDigit);


        }
    }
}
