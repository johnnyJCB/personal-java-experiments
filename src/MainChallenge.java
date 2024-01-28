public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        int finalScore = score;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next high score is " +
        calculateScore(true, 10000, 8, 200));

//          if (gameOver == true) {
//              finalScore += (levelCompleted * bonus);
//              System.out.println("Your final score was " + finalScore);
//          }
//        boolean newGameOver = true;
//        int newScore = 10_000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = newScore;
//            if (newGameOver == true) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += (1000);
//            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
