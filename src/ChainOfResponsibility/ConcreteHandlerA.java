package ChainOfResponsibility;

/**
 * 当请求数在0~10之间时有权处理，否则转到下一位
 * @author LMB
 *
 */
public class ConcreteHandlerA extends Handler {

    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}