package org.uqbar.project.wollok.game.domain;

import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbar.project.wollok.game.domain.gameboard.Gameboard;
import org.uqbar.project.wollok.game.domain.listeners.KeyboardListener;

import com.badlogic.gdx.Input.Keys;

public class KeyboardListenerTest {
	
	private KeyboardListener leftListener;
	private Mario mario;
	private Gameboard gameboard;
	@Before
	public void init() {
		mario = new Mario();
		leftListener = new KeyboardListener(Keys.LEFT, () -> mario.move());
		gameboard = mock(Gameboard.class);
	}
	
	@Test
	public void when_no_listened_key_is_pressed_nothing_happend(){
		leftListener.notifyKeyPressed(gameboard);
		Assert.assertFalse(mario.moved);
	}
	
	@Test
	public void when_listened_key_is_pressed_execute_the_action(){
		when(gameboard.isKeyPressed(Keys.LEFT)).thenReturn(true);
		leftListener.notifyKeyPressed(gameboard);
		Assert.assertTrue(mario.moved);
	}
	
	
	public class Mario {
		
		public boolean moved = false;
		
		public void move() {
			this.moved = true;
		}
		
	}
}


