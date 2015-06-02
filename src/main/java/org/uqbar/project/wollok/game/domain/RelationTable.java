package org.uqbar.project.wollok.game.domain;

import java.util.ArrayList;
import java.util.List;

public class RelationTable {
	private Interpreter aInterpreter;
	private List<Relation> relations;
	
	public RelationTable(Interpreter aInterpreter){
		this.relations = new ArrayList<Relation>();
		this.aInterpreter = aInterpreter;
	}

	public void addRelation(Relation relation) {
		this.relations.add(relation);
	}

	public void run() {
		this.relations.forEach(r -> {
			if (r.getActualValue().equals(aInterpreter.execute(r.getWollokQuery()))){
				r.getLambda().accept(r.getaVisualObject());
			}
			});
		
	}
	
	
}
