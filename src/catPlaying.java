public class catPlaying {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int nametemperature){
        if ((summer == true) && (nametemperature <= 45) && (nametemperature >= 25)){
            return true;
        }else if ((summer == false) && (nametemperature <= 35) && (nametemperature >= 25)){
            return true;
        }
        return false;
    }
}
