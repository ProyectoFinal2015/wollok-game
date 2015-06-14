package org.uqbar.project.wollok.game.domain.providers;

import com.badlogic.gdx.Gdx;

public class GdxInputProvider implements InputProvider {

	@Override
	public boolean isKeyPressed(int key) {
		return Gdx.input.isKeyPressed(key);
	}

}
