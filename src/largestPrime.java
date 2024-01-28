public class largestPrime {
    public static void main(String[] args) {
        int result = getLargestPrime(4);
        System.out.println(result);
    }
    public static int getLargestPrime(int number) {
        // Input Validation: If the given number is less than 2, return -1
        if (number < 2) {
            return -1;
        }
        // Variable to store the largest prime factor found
        int factor = -1;
        // Loop to find prime factors, iterating from 2 up to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            // If 'i' is not a factor, continue to the next iteration
            if (number % i != 0) {
                continue;
            }
            // 'i' is a factor of the number, store it as a potential prime factor
            factor = i;

            // Factorization loop: Divide 'number' by 'i' as many times as possible
            while (number % i == 0) {
                number /= i;
            }
        }
        // If 'number' is 1, return the stored 'factor' as the largest prime factor
        // If 'number' is not 1, return it as it's a prime factor larger than 'factor'
        return number == 1 ? factor : number;
    }
    }

//    public static int getLargestPrime(int number) {
//        if (number <= 1) {
//            return -1; // Return -1 for numbers less than or equal to 1
//        }
//        int max = 0; // Variable to hold the largest prime factor found
//        int c = 0;   // Temporary variable to store potential factors
//
//        // Loop through numbers from 2 up to the given 'number'
//        for (int i = 2; i <= number; i++) {
//            if (number % i == 0) { // Check if 'i' is a factor of the input 'number'
//                c = i; // Store 'i' as a potential factor (candidate)
//
//                // Check if the potential factor 'c' is prime
//                for (int j = 2; j < c; j++) {
//                    if (c % j == 0) { // If 'c' is divisible by 'j' without a remainder, it's not prime
//                        c = 0; // Set 'c' to 0 to indicate it's not a prime number
//                        break; // Exit the loop as it's not prime
//                    }
//                }
//                // Update the largest prime factor found so far
//                if (max < c) { // If 'c' is greater than the current largest prime factor 'max'
//                    max = c; // Update 'max' to store this larger prime factor
//                }
//            }
//        }
//        // Return the largest prime factor found or -1 if no prime factors found
//        return (max != 0) ? max : -1;
//    }
//}
//https://stackoverflow.com/questions/56664314/java-program-to-find-largest-prime-factor-but-the-output-is-wrong