package ChainOfResponsibility;

/**
 * ����������10~20֮��ʱ��Ȩ��������ת����һλ
 * @author LMB
 *
 */
public class ConcreteHandlerB extends Handler {

    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass() + "  ��������  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}