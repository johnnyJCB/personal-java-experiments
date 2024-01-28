public class minutesToYears {
    public static void main(String[] args) {
printYearsAndDays(800000000);
    }

    public static void printYearsAndDays(long minutes) {
        long XX = minutes;
        long hours = minutes / 60;
        long days = hours / 24;
        long YY = days / 365;
        int ZZ = (int) (days % 365);
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
            }
}