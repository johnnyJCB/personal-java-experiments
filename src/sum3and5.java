public class sum3and5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number;
        for(number = 1; number <= 1000; number = number+1){
            if(number % 3 == 0 && number % 5 ==0){
                sum = sum + number;
                System.out.println("identified " + number);
                count++;
            }if( count == 5){
                System.out.println("The sum of all numbers is " + sum);
                break;
            }
        }
    }
}
