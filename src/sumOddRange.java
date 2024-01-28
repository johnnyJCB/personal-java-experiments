public class sumOddRange {
    public static void main(String[] args) {
int result = sumOdd(13, 13);
        System.out.println(result);
    }

    public static boolean isOdd(int number) {
        if(number % 2 != 0 && number > 0){
            return true;
        }else{
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if(start <= 0 || end <= 0 || end < start){
            return -1;
        }int sumTotal = 0;
        for(int sum = start; sum <= end; sum++){
            if(isOdd(sum)){
                sumTotal += sum;
            }
        }return sumTotal;
    }
}

//public class SumOddRange {
//    // write code here
//    public static boolean isOdd(int number){
//        if(number > 0 && number % 2 != 0){
//            return true;
//        }
//        return false;
//    }
//    public static int sumOdd(int start, int end) {
//        if (start > 0 && end >= start){
//            int sum = 0;
//            for(int number = start; number <= end; number++){
//                if(isOdd(number)){
//                    sum = sum + number;
//                }
//            }
//            return sum;
//        }
//        return -1;
//    }
//}


