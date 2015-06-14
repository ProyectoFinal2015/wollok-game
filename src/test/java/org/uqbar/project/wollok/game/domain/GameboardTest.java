package org.uqbar.project.wollok.game.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbar.project.wollok.game.domain.gameboard.Gameboard;

public class GameboardTest {

	private Gameboard aGameBoard2x5;

	@Before
	public void init(){
		this.aGameBoard2x5 = new Gameboard("UnTitulo", 2, 5);
	}
	
	@Test
	public void on_initialize_create_all_cells() {
		Assert.assertEquals(10, this.aGameBoard2x5.getCells().size());
	}
}
