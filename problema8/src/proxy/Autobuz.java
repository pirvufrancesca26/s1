package proxy;

public class Autobuz implements MijlocTransport{
    private String nrAutobuz;
    private int nrCalatori;

    public Autobuz(String nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    public String getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(String nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {

    }
}
