package proxy;

public class MijlocTransportNopate implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public MijlocTransportNopate(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie(){
if(mijlocTransport.getNrCalatori()>0)
    mijlocTransport.opresteInStatie();
else{
    System.out.println("Autobuzul de noapte nu opreste in statie");
}
    }

    @Override
    public int getNrCalatori() {
        return 0;
    }
}
