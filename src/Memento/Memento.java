package Memento;
//备忘录对象，此备忘录有被存储对象的所有属性
public class Memento {
	   private String state;

	   public Memento(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }    
	}