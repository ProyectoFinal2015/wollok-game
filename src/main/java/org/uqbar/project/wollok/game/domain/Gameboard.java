package org.uqbar.project.wollok.game.domain;

import java.util.ArrayList;
import java.util.List;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Gameboard {
	
	private static final int CELLZISE = 50;
	private String tittle;
	private List<Cell> cells = new ArrayList<Cell>();
	private int cantCellX;
	private int cantCellY;

	public Gameboard(String tittle, int cantCellX, int cantCellY) {
		this.tittle = tittle;
		this.cantCellX = cantCellX;
		this.cantCellY = cantCellY;
		this.createCells(cantCellX, cantCellY);
	}

	public void render() {
		new LwjglApplication(new GameboardListener(this), new GameboardConfiguration(this));
	}

	public int height() {
		return cantCellY * CELLZISE;
	}

	public int width() {
		return cantCellX * CELLZISE;
	}
	
	private void createCells(int cantCellX, int cantCellY) {
		for (int i = 0; i < cantCellX; i++) {
			for (int j = 0; j < cantCellY; j++) {
				cells.add(new Cell(i*CELLZISE, j*CELLZISE));
			}
		}
	}

	// Getters & Setters
	public String getTittle() {
		return tittle;
	}
	
	public List<Cell> getCells() {
		return cells;
	}

}
