package problema12;

public abstract class Handler {
 Handler nextHandler;
protected int prag;

    public Handler(Handler nextHandler, int prag) {
        this.nextHandler = nextHandler;
        this.prag = prag;
    }

    public Handler(int prag) {
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getPrag() {
        return prag;
    }

    public void setPrag(int prag) {
        this.prag = prag;
    }
    public abstract void afiseazaCuCeSaMearga(int distanta);
}
