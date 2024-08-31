package games;

import controller.GameController;
import model.Deck;
import view.View;

public class games {
    public static void main(String[] args) {
        GameController gameController = new GameController(new Deck(), new View());
        gameController.run();
    }
}
