package Machine_Coding.TicTacToe.Models;

public class BotPlayer extends Player{
    private Bot_Diff_Level botDifficultyLevel;

    public Bot_Diff_Level getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(Bot_Diff_Level botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
