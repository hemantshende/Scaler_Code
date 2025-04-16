package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Bot_Diff_Level;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayongStrategy(Bot_Diff_Level botDiffLevel) {
        if(botDiffLevel==Bot_Diff_Level.EASY){
            return new Easy_BotPlayingStrategy();
        } else if (botDiffLevel==Bot_Diff_Level.MEDIUM) {
            return new Medium_BotPlayingStrategy();
        }
        return null;
    }
}
