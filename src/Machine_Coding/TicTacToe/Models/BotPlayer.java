package Machine_Coding.TicTacToe.Models;

import Machine_Coding.TicTacToe.Strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private Bot_Diff_Level botDifficultyLevel;

    public BotPlayer(Integer id, String name, Symbol symbol, Bot_Diff_Level botDifficultyLevel) {
        super(id, name, Player_Type.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot_Diff_Level getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(Bot_Diff_Level botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        Move move=BotPlayingStrategyFactory
                .getBotPlayingStrategy(botDifficultyLevel)
                .makeMove(board);

        return move;
    }
}
