package ChainOfResponsibility;

public abstract class Handler {

    protected Handler successor;//继任者

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求
    public void handleRequest(int request) {}


}