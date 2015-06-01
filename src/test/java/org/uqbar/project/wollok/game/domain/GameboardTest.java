package org.uqbar.project.wollok.game.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameboardTest {

	private Gameboard aGameBoard2x5;

	@Before
	public void init(){
		this.aGameBoard2x5 = new Gameboard("UnTitulo", 2, 5);
		
		GameBuilder builder;
		builder = new GameBuilder();
//		aGameBoard = builder.withSizes(5,5)
//				.withVisualComponent("Mario")
//				.withImage("mario.png")
//				.freeMovement()
//				.in(1,1)
//				.withVisualComponent("Moneda")
//				.withImage("moneda.png")
//				.in(4,3)
//				.withVisualComponent("BolsaDeMoneda")
//				.withImage("bolsa_monedas.png")
//				.in(4,1)
//				.when((unMario, unaAgarrable) -> unMario.getPosition().equals(unaAgarrable.getPosition()))
//				.execute("agarrar")
//				.build();
	}
	
	@Test
	public void on_initialize_create_all_cells() {
		Assert.assertEquals(10, this.aGameBoard2x5.getCells().size());
	}
}
