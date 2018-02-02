package ChainOfResponsibility;

/**
 * 当请求数在10~20之间时有权处理，否则转到下一位
 * @author LMB
 *
 */
public class ConcreteHandlerB extends Handler {

    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}