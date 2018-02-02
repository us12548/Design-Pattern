package Observer;

import java.util.ArrayList;
import java.util.List;
//���۲����
public class Subject {
   //�۲���ģʽ��Ҫһ�����ϴ洢�۲���󼯺�
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }
   //�����޸�ʱ���ù۲��߷���
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);        
   }
   //ѭ���۲���
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }     
}