package org.uqbar.project.wollok.game.listeners;

import java.util.function.Consumer;

import org.uqbar.project.wollok.game.VisualComponent;
import org.uqbar.project.wollok.game.gameboard.Gameboard;

public class CollisionListener implements GameboardListener {

	private VisualComponent component;
	private Consumer<VisualComponent> block;

	public CollisionListener(VisualComponent component, Consumer<VisualComponent> block) {
		this.component = component;
		this.block = block;
	}

	@Override
	public void notify(Gameboard gameboard) {
		gameboard.getComponentsInPosition(component.getMyPosition())
			.filter(it -> !it.equals(component))
			.forEach(it -> block.accept(it));
	}

}
