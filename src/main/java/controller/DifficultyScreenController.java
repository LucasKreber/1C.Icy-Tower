package controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import view.GameLoop;

/**
 * Controller class for the Difficulty Screen
 */
public class DifficultyScreenController extends MainController{

    /**
     * According to the user's difficulty choice it starts the game
     * @param actionEvent default input controller of java
     */
    public void openPlaySceneEasy(ActionEvent actionEvent){
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        GameLoop gameLoop = new GameLoop(1);
        primaryStage.setScene(gameLoop.start());

    }
    public void openPlaySceneMedium(ActionEvent actionEvent){
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        GameLoop gameLoop = new GameLoop(2);
        primaryStage.setScene(gameLoop.start());

    }
    public void openPlaySceneHard(ActionEvent actionEvent){
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        GameLoop gameLoop = new GameLoop(3);
        primaryStage.setScene(gameLoop.start());

    }


}
