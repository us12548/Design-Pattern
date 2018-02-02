package Mediator;

//定义具体中介者ConcreteMediator,具体中介者通过协调各同事对象实现协作行为，了解并维护它的各个同事。
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
  //同事A则把消息传给同事B，这个规则要提前定好
  @Override
  public void contact(String content, Colleague coll) {
      if (coll==collA) {
          collB.getMessage(content);
      } else {
          collA.getMessage(content);
      }
  }
}