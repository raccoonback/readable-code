package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.config.GameConfig;
import cleancode.minesweeper.tobe.gamelevel.Middle;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Middle(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        MineSweeper mineSweeper = new MineSweeper(gameConfig);
        mineSweeper.initialize();
        mineSweeper.run();
    }

    /**
     *
     * DIP (Dependency Inversion Principle)
     *
     * DI (Dependency Injection) - "3"
     *
     * IoC (Inversion of Control)
     *
     */
}
