import java.util.ArrayList;
import java.util.Scanner;

public class mook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Enter numbers (Enter -1 to stop):");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            numberList.add(number);
        }

        System.out.println("Numbers added to the list:");
        for (int num : numberList) {
            System.out.println(num);
        }

        System.out.println("Enter start index:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter end index:");
        int endIndex = scanner.nextInt();

        System.out.println("Numbers within the specified range:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("The number at index " + i + " is " +numberList.get(i));
        }
        int greatest = numberList.get(0);

        for(int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (greatest < number) {
                greatest = number;
            }
        }
        System.out.println("The greatest number is " + greatest);
        System.out.println(greatest + " is at index " + numberList.indexOf(greatest));
    }
}