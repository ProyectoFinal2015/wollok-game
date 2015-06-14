package org.uqbar.project.wollok.game.listeners;

import org.uqbar.project.wollok.game.gameboard.Gameboard;

public class KeyboardListener implements Listener {

	private int key;
	private Runnable gameAction;

	public KeyboardListener(int key, Runnable gameAction) {
		this.key = key;
		this.gameAction = gameAction;
		
	}

	public void notifyKeyPressed(Gameboard gameboard) {
		if (gameboard.isKeyPressed(this.key))
			gameAction.run();
	}
}
