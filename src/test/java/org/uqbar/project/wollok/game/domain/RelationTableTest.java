package org.uqbar.project.wollok.game.domain;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class RelationTableTest {

	private Interpreter mockInterpreter;
	private RelationTable table;
	
	@Before
	public void init(){
		mockInterpreter = mock(Interpreter.class);
		when(mockInterpreter.execute(any(String.class))).thenReturn("3");
		table = new RelationTable(mockInterpreter);
		table.addRelation(new Relation(new VisualComponent(), "3", "bla", x-> {}));
		table.addRelation(new Relation(new VisualComponent(), "3", "bla", x-> {}));		
	}
	
	@Test
	public void interfaceIsCalledATimeAsRelationQantity(){
		table.run();
		verify(mockInterpreter, times(2)).execute(any(String.class));
	}
}
