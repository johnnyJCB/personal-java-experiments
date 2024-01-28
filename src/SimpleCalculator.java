public class SimpleCalculator {

    private double firstNumber;  // Private variable to store the first number
    private double secondNumber; // Private variable to store the second number

    // Getter method to retrieve the value of the first number
    public double getFirstNumber(){
        return firstNumber;
    }

    // Getter method to retrieve the value of the second number
    public double getSecondNumber(){
        return secondNumber;
    }

    // Setter method to set the value of the first number
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    // Setter method to set the value of the second number
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    // Method to get the result of adding the first and second numbers
    public double getAdditionResult(){
        return (firstNumber + secondNumber);
    }

    // Method to get the result of subtracting the second number from the first number
    public double getSubtractionResult(){
        double result1 = firstNumber - secondNumber;
        return result1;
    }

    // Method to get the result of multiplying the first and second numbers
    public double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }

    // Method to get the result of dividing the first number by the second number
    public double getDivisionResult(){
        if(secondNumber != 0){  // Check if the second number is not zero to avoid division by zero
            double result = firstNumber / secondNumber;
            return result;
        } else {
            return 0;  // Return zero if the second number is zero to avoid division by zero
        }
    }
}