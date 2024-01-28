public class ComplexNumber {
    // Instance variables to store the real and imaginary parts of a complex number
    private double real;
    private double imaginary;

    // Constructor to initialize the real and imaginary parts of a complex number
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter method to retrieve the real part of the complex number
    public double getReal(){
        return real;
    }

    // Getter method to retrieve the imaginary part of the complex number
    public double getImaginary(){
        return imaginary;
    }

    // Method to add a given real and imaginary values to the current complex number
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    // Method to add another complex number to the current complex number
    public void add(ComplexNumber a){
        // Calls the other add method with the real and imaginary parts of the given complex number 'a'
        add(a.real, a.imaginary);
    }

    // Method to subtract given real and imaginary values from the current complex number
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Method to subtract another complex number from the current complex number
    public void subtract(ComplexNumber a){
        // Calls the other subtract method with the real and imaginary parts of the given complex number 'a'
        subtract(a.real, a.imaginary);
    }
}
//or
//public class ComplexNumber {
//    // Instance variables to store the real and imaginary parts of a complex number
//    private double real;
//    private double imaginary;
//
//    // Constructor that initializes the real and imaginary parts of a complex number
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    // Getter method for retrieving the real part of the complex number
//    public double getReal() {
//        return real;
//    }
//
//    // Getter method for retrieving the imaginary part of the complex number
//    public double getImaginary() {
//        return imaginary;
//    }
//
//    // Method to perform addition of a given real and imaginary numbers to the complex number
//    public void add(double real, double imaginary) {
//        this.real += real;
//        this.imaginary += imaginary;
//    }
//
//    // Method to perform addition of another complex number to the current complex number
//    public void add(ComplexNumber complexNumber) {
//        this.real += complexNumber.getReal();
//        this.imaginary += complexNumber.getImaginary();
//    }
//
//    // Method to perform subtraction of given real and imaginary numbers from the complex number
//    public void subtract(double real, double imaginary) {
//        this.real -= real;
//        this.imaginary -= imaginary;
//    }
//
//    // Method to perform subtraction of another complex number from the current complex number
//    public void subtract(ComplexNumber complexNumber) {
//        this.real -= complexNumber.getReal();
//        this.imaginary -= complexNumber.getImaginary();
//    }
//}