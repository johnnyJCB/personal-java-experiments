public class SecondstoMinutes {
    public static void main(String[] args) {
String test1 = getDurationString(3945);
        System.out.println(test1);
        String test2 = getDurationString(65,45);
        System.out.println(test2);
    }

    public static String getDurationString(int seconds) {
        int XX = seconds / 3600;
        String hours = (""+XX);
        int remaining = seconds % 3600;
//        String remainingSeconds = (""+ remaining);
        if (seconds < 0) {
            return "Invalid value";
        }else
//            return (hours+"h"+getDurationString(60, 20));
        return (hours+"h"+getDurationString(remaining/60, remaining%60));
    }



    public static String getDurationString(int minutes, int seconds) {
        int YY = minutes;
        int ZZ = seconds;
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else
            return ((""+ YY+"m")+(""+ZZ+"s"));
    }
}
