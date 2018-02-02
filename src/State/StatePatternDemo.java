package State;

public class StatePatternDemo {
	   public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      //为当前对象赋予状态
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	   }
	}