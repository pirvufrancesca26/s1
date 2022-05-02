package proxy;

public class MainProxy {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("b123ABC",20);
        Autobuz autobuz2=new Autobuz("b321ABC",25);

        MijlocTransportNopate mijlocTransportNopate=new MijlocTransportNopate(autobuz);
        MijlocTransportNopate mijlocTransportNopate2=new MijlocTransportNopate(autobuz2);
        autobuz.opresteInStatie();
        autobuz2.opresteInStatie();
        mijlocTransportNopate.opresteInStatie();
        mijlocTransportNopate2.opresteInStatie();
    }
}
