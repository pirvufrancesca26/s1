package pr14;

public class Main {
    public static void main(String[] args){
        MijlocTransportPeSine tramvai =new Tramvai();
        tramvai.parcurgeTraseuInSensNormal();
        System.out.println("**************");
        tramvai.parcurgeTraseuInSensInvers();
    }
    //tramvai.opresteInStatie2();
 }
