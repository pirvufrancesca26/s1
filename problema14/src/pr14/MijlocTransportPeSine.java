package pr14;

public  abstract class MijlocTransportPeSine {
    protected abstract void opresteInStatie();
    protected abstract void opresteInStatie2();
    protected abstract void opresteInStatie3();

public final void parcurgeTraseuInSensNormal(){
    opresteInStatie();
    opresteInStatie2();
    opresteInStatie3();
};

    public final void parcurgeTraseuInSensInvers(){
        opresteInStatie();
        opresteInStatie2();
        opresteInStatie3();
    };
}

