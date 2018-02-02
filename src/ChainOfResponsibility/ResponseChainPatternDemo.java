package ChainOfResponsibility;

public class ResponseChainPatternDemo {

    public static void main(String[] args) {

        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        //������������ǰ���ͺ��(��������ʽ��ϣ����������ģʽ)
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2,5,14,22,18,27,20};
        for (int request : requests) {
            handlerA.handleRequest(request);
        }

    }

}