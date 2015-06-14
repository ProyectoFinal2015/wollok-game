package org.uqbar.project.wollok.game.gameboard;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameboardListener implements ApplicationListener {

	private Gameboard gameboard;
	private OrthographicCamera camera;
	private SpriteBatch batch;

	public GameboardListener(Gameboard gameboard) {
		this.gameboard = gameboard;
	}

	@Override
	public void create() {
		camera = new OrthographicCamera(0, 0);
		camera.setToOrtho(false, gameboard.width(), gameboard.height());
		batch = new SpriteBatch();
	}

	@Override
	public void render() {
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		gameboard.getListeners().forEach(listener -> listener.notify(gameboard));
		gameboard.getCells().forEach(cell -> this.draw(cell));
		
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
	
	private void draw(Cell cell) {
		Texture texture = new Texture(Gdx.files.internal(cell.element));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		batch.draw(texture, cell.width, cell.height);
	}
	
	
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
}

