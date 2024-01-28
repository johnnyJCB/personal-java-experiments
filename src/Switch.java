import java.sql.SQLOutput;

public class Switch {
    public static void main(String[] args) {
        char letter = 'F';
        switch (letter) {
            case 'A':
                System.out.println("Letter was " + letter + " the word for that letter is Able");
                break;
            case 'B':
                System.out.println("Letter was " + letter + " the word for that letter is Baker");
                break;
            case 'C':
                System.out.println("Letter was " + letter + " the word for that letter is Charlie");
                break;
            case 'D':
                System.out.println("Letter was " + letter + " the word for that letter is Dog");
                break;
            default:
                System.out.println("Letter " + letter + " is an invalid Character");
        }

    }

}