package Program;

import problema12.*;

public class Program {
    public static void main(String[] args){
        AutobuzHandler autobuzHandler=new AutobuzHandler(null,5);
        Troleibuz troleibuzHandler=new Troleibuz(5);
        TramvaiHandler tramvaiHandler=new TramvaiHandler(3);
        Metrou metrouHanlder=new Metrou();
        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHanlder);

        troleibuzHandler.afiseazaCuCeSaMearga(4);
        troleibuzHandler.afiseazaCuCeSaMearga(2);
        troleibuzHandler.afiseazaCuCeSaMearga(7);
        troleibuzHandler.afiseazaCuCeSaMearga(12);

        Handler autobuzHCluj=new AutobuzHandler(null,3000);
        Handler tramvaiHCluj=new TramvaiHandler(8);
        Handler troleibuzHCluj=new Troleibuz(3);
        troleibuzHCluj.setNextHandler(tramvaiHCluj);
        tramvaiHCluj.setNextHandler(autobuzHCluj);


    }
}
