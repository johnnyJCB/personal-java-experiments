public class lastDigitChecker {
    public static void main(String[] args) {
boolean result = hasSameLastDigit(82, 70, 80);
        System.out.println(result);
        boolean result1= isValid(8);
        System.out.println(result1);
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000))){
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;
            return (lastA == lastB || lastB == lastC || lastA == lastC);
        }return false;
    }
    public static boolean isValid(int x){
        if(x >= 10 && x <= 1000){
            return true;
        }return false;
    }
}

