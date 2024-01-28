public class Method {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1200);
        displayHighScorePosition("Jose", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Joe", highScorePosition);

        highScorePosition = calculateHighScorePosition(90);
        displayHighScorePosition("Allan", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int score) {
//        int finalScore = score;
        if (score >= 1000)
            return 1;
        else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } // else {
//            return 4;
        return 4;
    }
}

