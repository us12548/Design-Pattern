package Observer;

import java.util.ArrayList;
import java.util.List;
//被观察对象
public class Subject {
   //观察者模式需要一个集合存储观察对象集合
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }
   //对象修改时调用观察者方法
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);        
   }
   //循环观察者
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }     
}