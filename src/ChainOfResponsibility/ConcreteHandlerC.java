package ChainOfResponsibility;

/**
 * ����������20~30֮��ʱ��Ȩ��������ת����һλ
 * @author LMB
 *
 */
public class ConcreteHandlerC extends Handler {

    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass() + "  ��������  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}