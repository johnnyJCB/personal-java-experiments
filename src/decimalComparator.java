public class decimalComparator {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.587, 3.587);
        System.out.println(result);

    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double z) {
        long toLong1 = (long) (x * 1000);
        long toLong2 = (long) (z * 1000);
        if (toLong1 == toLong2) {
            return true;
        }else
            return false;
    }

    public class EqualSumChecker {
        // write code here
        public static boolean hasEqualSum(int a, int b, int c) {
            if (a + b == c) {
                return true;
            }else
                return false;
        }

        public static boolean hasTeen(int a, int b, int c) {
            if ((a >= 13) && (a <= 19)) {
                return true;
            } else if ((b >= 13) && (b <= 19)){
                return true;
        }else if ((c >= 13) && (c <= 19)) {
                return true;
            }else
                return false;
        }

        public static boolean isTeen(int x) {
            if ((x >= 13) && (x <= 19)){
                return true;
        }
                return false;
        }
    }
}
