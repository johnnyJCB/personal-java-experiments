public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        int highscore = 500000;
        if (highscore > 25){
            highscore = 1000 + highscore; // add bonus points
        }
        int health = 10;
        if ((health < 25) && (highscore > 1000)){
            System.out.println(highscore);
            System.out.println(health);
            highscore = highscore - 1000;
            System.out.println(highscore);
        }
    }
}

