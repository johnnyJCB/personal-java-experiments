public class SwitchExpression {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printDay(1);
        printNumberInWord(0);
        int RESULT = getDaysInMonth(2,2020);
        System.out.println(RESULT);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "BAD RESPONSE";

        };
        System.out.println(day + " " + dayOfTheWeek);
    }

    public static void printDay(int day) {
        if (day == 0) {
            System.out.println(day + " Sunday");
        } else if (day == 1) {
            System.out.println(day + " Monday");
        } else {
            System.out.println(" too much work");
        }
    }

    public static void printNumberInWord(int lastDigit) {
        String result = switch (lastDigit) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            default -> "Invalid";
        };
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year < 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else
                return false;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)){
            return -1;
        }else {
           boolean isyear = isLeapYear(year);
            switch (month) {
                case 1:
                case 3: // March
                case 5: // May
                case 7: // July
                case 8: // August
                case 10: // October
                case 12: // December
                    return 31;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    return 30;
                case 2: // February
                    return isyear ? 29 : 28;
                default:
                    return 0;
            }
        }
    }

}