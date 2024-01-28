public class flourPackProblem {
    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Checking if any of the counts or the goal is negative, if so, immediately return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Assigning the weight of a single big bag
        int bigWeight = 5;

        // Calculating the total weight from all the big bags available
        int totalBigWeight = bigCount * bigWeight;

        // If the total weight from big bags exactly matches the goal
        // or if the remaining weight needed can be covered by the available small bags
        if (totalBigWeight == goal || (totalBigWeight < goal && (goal - totalBigWeight) <= smallCount)) {
            return true;
        }

        // If the total weight from big bags is greater than the goal,
        // and the remaining weight needed can be covered by the available small bags
        if (totalBigWeight > goal && goal % bigWeight <= smallCount) {
            return true;
        }

        // If none of the conditions above are met, it means the goal cannot be met using the available bags
        return false;
//    }or
//        public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//            if (bigCount < 0 || smallCount < 0 || goal < 0) {
//                return false;
//            }
////            boolean result = false;
//            int totalBigWeight = bigCount * BIG_WEIGHT;
//            if (totalBigWeight >= goal) {
//                int remaining = goal % BIG_WEIGHT;
//                if (smallCount >= remaining) {
//                    result = true;
//                }
//            } else {
//                if (smallCount >= goal - totalBigWeight) {
//                    result = true;
//                }
//            }
//            return result;
//        }
//    }
    }
}

