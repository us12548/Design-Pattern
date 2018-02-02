package Mediator;

//��������н���ConcreteMediator,�����н���ͨ��Э����ͬ�¶���ʵ��Э����Ϊ���˽Ⲣά�����ĸ���ͬ�¡�
public class ConcreteMediator extends Mediator {
  ColleagueA collA;
  ColleagueB collB;

  public ColleagueA getCollA() {
      return collA;
  }

  public void setCollA(ColleagueA collA) {
      this.collA = collA;
  }

  public ColleagueB getCollB() {
      return collB;
  }

  public void setCollB(ColleagueB collB) {
      this.collB = collB;
  }
  //ͬ��A�����Ϣ����ͬ��B���������Ҫ��ǰ����
  @Override
  public void contact(String content, Colleague coll) {
      if (coll==collA) {
          collB.getMessage(content);
      } else {
          collA.getMessage(content);
      }
  }
}