package org.uqbar.project.wollok.game.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.badlogic.gdx.Input.Keys;

public class KeyboardListenerTest {
	
	public class GameMock extends Game {
		public boolean finished = false;
		@Override
		public void end() {
			finished = true;
		}
	}

	private KeyboardListener endListener;
	private GameMock game;

	@Before
	public void init() {
		game = new GameMock();
		endListener = new KeyboardListener(game, Keys.E, game -> game.end());
	}
	
	@Test
	public void when_no_listened_key_is_pressed_nothing_happend(){
		endListener.notifyKeyPressed(Keys.A);
		Assert.assertFalse(game.finished);
	}
	
	@Test
	public void when_listened_key_is_pressed_execute_the_game_action(){
		endListener.notifyKeyPressed(Keys.E);
		Assert.assertTrue(game.finished);
	} 
}
