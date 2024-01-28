public class greatestCommonDivisor {
    public static void main(String[] args) {
        int result = getGreatestCommonDivisor(25, 15);
        System.out.println(result);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int smallerNumber = 0;
        int GCD = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        if (first > second) {
            smallerNumber = second;
        }else if (second > first) {
            smallerNumber = first;
        }GCD = 1;
                for (int i = 1; i <= smallerNumber; i++) {
                    if (first % i == 0 && second % i == 0) {
                        GCD = i;
                    }
                }return GCD;
            }
        }


