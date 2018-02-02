package State;
//每个实现类就代表了某种状态
public class StartState implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in start state");
	      context.setState(this);    
	   }

	   public String toString(){
	      return "Start State";
	   }
	}