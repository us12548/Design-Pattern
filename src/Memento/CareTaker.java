package Memento;

import java.util.ArrayList;
import java.util.List;
//管理员，扮演存储器角色
public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}