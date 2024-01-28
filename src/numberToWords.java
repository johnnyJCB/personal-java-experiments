public class numberToWords {
    public static void main(String[] args) {
        numberToWords(50);
int result = reverse(50);
        System.out.println(result);
    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
            };
            int reversedNumber = reverse(number);

            // If the original number was 0, print Zero
            if (number == 0) {
                System.out.println(words[0]);
            } else {
                while (reversedNumber != 0) {
                    int lastDigit = reversedNumber % 10;
                    System.out.print(words[lastDigit] + " ");
                    reversedNumber /= 10;
                }
            }
        } else {
            System.out.println("Invalid digit");
        }
    }


    public static int reverse(int number) {
        int reverse = 0;
//        int original= number;

            while (number != 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number = number / 10;
            }return reverse;
        }
       public static int getDigitCount(int number){
        if(number <0){
            return -1;
        }else if (number == 0){
            return 1;
        }int count = 0;
           while (number != 0) {
               count++; // Increment the count for each digit
               number /= 10; // Remove the last digit
           }return count;
       }
    }

