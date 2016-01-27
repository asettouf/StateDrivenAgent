package org.state.driven.classes;

public class Troll {
	
	protected State currState;
	
	public Troll() {
		
		
	}
	
	public void update(){
		this.currState.execute(this);
	}
	
	public void changeState(State newState){
		this.currState = newState;
	}

}
