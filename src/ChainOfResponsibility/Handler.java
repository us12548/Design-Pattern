package ChainOfResponsibility;

public abstract class Handler {

    protected Handler successor;//������

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //��������
    public void handleRequest(int request) {}


}