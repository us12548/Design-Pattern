package ChainOfResponsibility;

/**
 * ����������0~10֮��ʱ��Ȩ��������ת����һλ
 * @author LMB
 *
 */
public class ConcreteHandlerA extends Handler {

    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass() + "  ��������  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}