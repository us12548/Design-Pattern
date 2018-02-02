package Observer;
//subject主题
//Observer观察者
public abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
	}