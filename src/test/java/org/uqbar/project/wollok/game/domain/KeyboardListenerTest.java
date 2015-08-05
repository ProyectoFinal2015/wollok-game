package org.uqbar.project.wollok.game.domain;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.uqbar.project.wollok.game.gameboard.Gameboard;
import org.uqbar.project.wollok.game.listeners.KeyboardListener;

import com.badlogic.gdx.Input.Keys;

public class KeyboardListenerTest {
	
	private KeyboardListener leftListener;
	private Gameboard gameboard;
	private Runnable action;
	
	@Before
	public void init() {
		gameboard = mock(Gameboard.class);
		action = mock(Runnable.class);
		leftListener = new KeyboardListener(Keys.LEFT, action);
	}
	
	@Test
	public void when_no_listened_key_is_pressed_nothing_happens(){
		leftListener.notify(gameboard);
		verify(action, never()).run();
	}
	
	@Test
	public void when_listened_key_is_pressed_run_the_action(){
		when(gameboard.isKeyPressed(Keys.LEFT)).thenReturn(true);
		leftListener.notify(gameboard);
		verify(action).run();
	}
}


