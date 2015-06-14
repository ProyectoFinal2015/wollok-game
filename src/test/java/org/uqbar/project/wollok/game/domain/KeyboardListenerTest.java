package org.uqbar.project.wollok.game.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbar.project.wollok.game.domain.gameboard.Gameboard;
import org.uqbar.project.wollok.game.domain.listeners.KeyboardListener;
import org.uqbar.project.wollok.game.domain.providers.InputProvider;

import com.badlogic.gdx.Input.Keys;

public class KeyboardListenerTest {
	
	private KeyboardListener leftListener;
	private Mario mario;
	private Gameboard gameboard;
	private MockInputProvider inputProvider;

	@Before
	public void init() {
		mario = new Mario();
		leftListener = new KeyboardListener(Keys.LEFT, () -> mario.move());
		gameboard = new Gameboard(null, 0, 0);
		inputProvider = new MockInputProvider();
		gameboard.setInputProvider(inputProvider);
	}
	
	@Test
	public void when_no_listened_key_is_pressed_nothing_happend(){
		leftListener.notifyKeyPressed(gameboard);
		Assert.assertFalse(mario.moved);
	}
	
	@Test
	public void when_listened_key_is_pressed_execute_the_action(){
		inputProvider.key = Keys.LEFT;
		leftListener.notifyKeyPressed(gameboard);
		Assert.assertTrue(mario.moved);
	}
	
	
	public class Mario {
		
		public boolean moved = false;
		
		public void move() {
			this.moved = true;
		}
		
	}
	
	public class MockInputProvider implements InputProvider{
		
		public int key = 0;
		
		@Override
		public boolean isKeyPressed(int key) {
			return this.key == key;
		}
		
	}
}


