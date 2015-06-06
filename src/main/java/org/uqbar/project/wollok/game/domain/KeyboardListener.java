package org.uqbar.project.wollok.game.domain;

import java.util.function.Consumer;

public class KeyboardListener {

	private Game game;
	private int key;
	private Consumer<Game> gameAction;

	public KeyboardListener(Game game, int key, Consumer<Game> gameAction) {
		this.game = game;
		this.key = key;
		this.gameAction = gameAction;
		
	}

	public void notifyKeyPressed(int keyPressed) {
		if (keyPressed == key)
			gameAction.accept(game);
	}

}
