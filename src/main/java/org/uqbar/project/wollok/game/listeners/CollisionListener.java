package org.uqbar.project.wollok.game.listeners;

import java.util.function.Consumer;

import org.uqbar.project.wollok.game.VisualComponent;
import org.uqbar.project.wollok.game.gameboard.Gameboard;

public class CollisionListener implements Listener {

	private VisualComponent component;
	private Consumer<VisualComponent> block;

	public CollisionListener(VisualComponent component, Consumer<VisualComponent> block) {
		this.component = component;
		this.block = block;
	}

	@Override
	public void notifyKeyPressed(Gameboard gameboard) {
		// TODO Auto-generated method stub
		
	}

}
