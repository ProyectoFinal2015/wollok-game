package org.uqbar.project.wollok.game.domain;

import java.util.function.Consumer;

public class Relation {
	private VisualComponent aVisualObject;
	private String actualValue;
	private String wollokQuery;
	private Consumer<VisualComponent> lambda;

	public Relation(VisualComponent aVisualComponent, String actualValue, String wollokQuery, Consumer<VisualComponent> aLambda){
		this.setaVisualObject(aVisualComponent);
		this.setActualValue(actualValue);
		this.setWollokQuery(wollokQuery);
		this.setLambda(aLambda);
	}

	public String getActualValue() {
		return actualValue;
	}

	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}

	public String getWollokQuery() {
		return wollokQuery;
	}

	public void setWollokQuery(String wollokQuery) {
		this.wollokQuery = wollokQuery;
	}

	public VisualComponent getaVisualObject() {
		return aVisualObject;
	}

	public void setaVisualObject(VisualComponent aVisualObject) {
		this.aVisualObject = aVisualObject;
	}

	public Consumer<VisualComponent> getLambda() {
		return lambda;
	}

	public void setLambda(Consumer<VisualComponent> lambda) {
		this.lambda = lambda;
	}
	
	
	
}
