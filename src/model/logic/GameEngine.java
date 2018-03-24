package model.logic;

import java.util.Timer;
import javafx.scene.image.Image;
import model.entity.Camera;

public class GameEngine {

	private MapGenerator mapgen;
	private PauseManager pm;
	//private GameFrame gf;
	private CollisionManager cm;
	private Camera camera;
	private Timer timer;
	private int currentAltitude;
	private int currentScore;
	private boolean gameFinished;
	private boolean gamePaused;
	private int difficulty;

	//TODO this class should initialize a display and then maintain the game process
	//TODO let game engine initialize a game character, map that contains game objects
	//TODO then let view module display it.
	//TODO then process should continue throughout the gametime

	public GameEngine() {
		// TODO - implement GameEngine.GameEngine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param difficulty
	 * @param charImages
	 * @param buttons
	 */
	public GameEngine(int difficulty, Image[] charImages, char[] buttons) {
		// TODO - implement GameEngine.GameEngine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param images
	 */
	public void setCurrentCharactersImages(Image[] images) {
		// TODO - implement GameEngine.setCurrentCharactersImages
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param buttons
	 */
	public void setGameButtons(char[] buttons) {
		// TODO - implement GameEngine.setGameButtons
		throw new UnsupportedOperationException();
	}

	public void updateScore() {
		// TODO - implement GameEngine.updateScore
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param diff
	 */
	public void initializeMap(int diff) {
		// TODO - implement GameEngine.initializeMap
		throw new UnsupportedOperationException();
	}

	public void followCharactersAltitude() {
		// TODO - implement GameEngine.followCharactersAltitude
		throw new UnsupportedOperationException();
	}

	public boolean isGameOver() {
		// TODO - implement GameEngine.isGameOver
		throw new UnsupportedOperationException();
	}

	public boolean isGamePaused() {
		return this.gamePaused;
	}

	public void startGame() {
		// TODO
		// intialize the game here
		// initializeMap()
		//
		throw new UnsupportedOperationException();
	}

	public void finishGame() {
		// TODO - implement GameEngine.finishGame
		throw new UnsupportedOperationException();
	}

	public void pauseGame() {
		// TODO - implement GameEngine.pauseGame
		throw new UnsupportedOperationException();
	}

	public void continueGame() {
		// TODO - implement GameEngine.continueGame
		throw new UnsupportedOperationException();
	}

	public void exitGame() {
		// TODO - implement GameEngine.exitGame
		throw new UnsupportedOperationException();
	}

	public void changeVolume() {
		// TODO - implement GameEngine.changeVolume
		throw new UnsupportedOperationException();
	}

	public void changeMusic() {
		// TODO - implement GameEngine.changeMusic
		throw new UnsupportedOperationException();
	}

}