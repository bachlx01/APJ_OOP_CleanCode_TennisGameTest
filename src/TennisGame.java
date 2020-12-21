public class TennisGame {


    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String scoreToString = "";
        boolean allScore = player1Score == player2Score;
        boolean Deuce = player1Score>=4 || player2Score>=4;

        if (allScore) scoreToString = allScoreToString(player1Score);

        else if (Deuce) scoreToString = deuceToString(player1Score, player2Score);

        else scoreToString = scoreToString(player1Score, player2Score);

        return scoreToString;
    }


    private static String allScoreToString(int playerScore) {
        String scoreToString = "";
        switch (playerScore) {
            case 0:
                scoreToString = "Love-All";
                break;
            case 1:
                scoreToString = "Fifteen-All";
                break;
            case 2:
                scoreToString = "Thirty-All";
                break;
            case 3:
                scoreToString = "Forty-All";
                break;
            default:
                scoreToString = "Deuce";
                break;
        }
        return scoreToString;
    }

    private static String deuceToString(int player1Score, int player2Score){
        String scoreToString = "";
        int minusResult = player1Score-player2Score;
        if (minusResult==1) scoreToString ="Advantage player1";
        else if (minusResult ==-1) scoreToString ="Advantage player2";
        else if (minusResult>=2) scoreToString = "Win for player1";
        else scoreToString ="Win for player2";
        return scoreToString;
    }

    private static String scoreToString(int player1Score, int player2Score) {
        String scoreToString = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                scoreToString += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    scoreToString += "Love";
                    break;
                case 1:
                    scoreToString += "Fifteen";
                    break;
                case 2:
                    scoreToString += "Thirty";
                    break;
                case 3:
                    scoreToString += "Forty";
                    break;
            }
        }
        return scoreToString;
    }
}
