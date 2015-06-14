package org.uqbar.project.wollok.game.domain.gameboard;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.project.wollok.game.domain.listeners.KeyboardListener;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Gameboard {
	
	private static final int CELLZISE = 50;
	private String tittle;
	private List<Cell> cells = new ArrayList<Cell>();
	private int cantCellX;
	private int cantCellY;
	private List<KeyboardListener> listeners;

	public Gameboard(String tittle, int cantCellX, int cantCellY) {
		this.tittle = tittle;
		this.cantCellX = cantCellX;
		this.cantCellY = cantCellY;
		this.createCells(cantCellX, cantCellY);
	}
	
	private void createCells(int cantCellX, int cantCellY) {
		for (int i = 0; i < cantCellX; i++) {
			for (int j = 0; j < cantCellY; j++) {
				cells.add(new Cell(i*CELLZISE, j*CELLZISE));
			}
		}
	}

	public void start() {
		new LwjglApplication(new GameboardListener(this), new GameboardConfiguration(this));
	}
	
	public int height() {
		return cantCellY * CELLZISE;
	}

	public int width() {
		return cantCellX * CELLZISE;
	}
	
	public boolean isKeyPressed(int key) {
		return Gdx.input.isKeyPressed(key);
	}

	
	// Getters & Setters
	public String getTittle() {
		return tittle;
	}
	
	public List<Cell> getCells() {
		return cells;
	}

	public List<KeyboardListener> getListeners() {
		return listeners;
	}
}
