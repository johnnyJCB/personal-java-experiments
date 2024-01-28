public class whileLoop {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int oddCount = 0;
        int countEven = 0;
        while (number <= finishNumber){
            number++;

            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number);
            countEven++;
            if (countEven == 5) {
                break;
            }
//            System.out.println(oddCount);
//            System.out.println(countEven);
        }
        System.out.println("total odd numbers are " + oddCount);
        System.out.println("total even numbers are " + countEven);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}



//    public static void isEvenNumber(int number) {
//            number = 5;
//            while (number <= 20 ) {
//                if (number % 2 == 0)
//                System.out.println(number);
//                number++;
//
//            }
//    }
