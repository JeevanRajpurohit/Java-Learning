package game;

public class MainFileForGameRunner {
    public static void main(String[] args) {
        var game = new PacmanManGame();

        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
