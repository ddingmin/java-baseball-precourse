package baseball;

import baseball.controller.BaseballGameController;
import baseball.domain.GameCommand;
import baseball.view.Input;

public class Application {
    public static void main(String[] args) {
        BaseballGameController baseballGameController = new BaseballGameController();
        GameCommand gameStatus = Input.command();

        while (gameStatus == GameCommand.START) {
            baseballGameController.process(gameStatus);
            gameStatus = Input.command();
        }
    }
}
