package org.uqbar.project.wollok.game.domain;

import java.util.List;

public class Gameboard {

		private List<VisualComponent> myObjects;
		private List<Event> myEvents;
		
		
		
		public List<VisualComponent> getMyObjects() {
			return myObjects;
		}
		public void setMyObjects(List<VisualComponent> myObjects) {
			this.myObjects = myObjects;
		}
		public List<Event> getMyEvents() {
			return myEvents;
		}
		public void setMyEvents(List<Event> myEvents) {
			this.myEvents = myEvents;
		}
}
