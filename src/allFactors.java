public class allFactors {
    public static void main(String[] args) {
printFactors(9);
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }for(int i = 1; i <= number; i++){ //initiates for loop where i starts at 1 and increments by 1 in each iteration until i reaches the value of number
            if(number % i == 0){ // checks if the current value of i is a factor of number
                System.out.println(i);
            }
        }
    }
}
