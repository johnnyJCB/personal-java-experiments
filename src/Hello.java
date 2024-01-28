import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("and I am scared of Aliens");
        }
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score");
        }// else if (topscore !=100){
            //        System.out.println("You are not the high score");
        //}
       int secondTopScore = 95;
        if ((topscore > secondTopScore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topscore) > 90 || (secondTopScore < 90)){
            System.out.println("Either or both  the conditions are true");
        }
    int newV = 50;
        if (newV == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }
        String makeOfCar = "Honda";
        boolean isDomestic = (makeOfCar =="Honda") ? false:true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? " This car is domestic" : "This car is not domestic";
        System.out.println(s);

    }
}
