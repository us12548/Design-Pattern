package Memento;

public class Originator {
	//该备忘录要保存的只有这个属性
	   private String state;

	   public void setState(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	   }
	}