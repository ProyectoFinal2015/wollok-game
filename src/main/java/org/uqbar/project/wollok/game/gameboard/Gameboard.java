package org.uqbar.project.wollok.game.gameboard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.uqbar.project.wollok.game.Position;
import org.uqbar.project.wollok.game.VisualComponent;
import org.uqbar.project.wollok.game.listeners.Listener;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Gameboard {
	
	private static final int CELLZISE = 50;
	private String tittle;
	private List<Cell> cells = new ArrayList<Cell>();
	private int cantCellX;
	private int cantCellY;
	private List<Listener> listeners;
	private List<VisualComponent> components;

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
	
	public Stream<VisualComponent> getComponentsInPosition(Position myPosition) {
		return components.stream().filter(it -> it.getMyPosition().equals(myPosition));
	}

	
	// Getters & Setters
	public String getTittle() {
		return tittle;
	}
	
	public List<Cell> getCells() {
		return cells;
	}

	public List<Listener> getListeners() {
		return listeners;
	}
	
	public List<VisualComponent> getComponents() {
		return this.components;
	}

	public void setComponents(List<VisualComponent> components) {
		this.components = components;
	}
}
