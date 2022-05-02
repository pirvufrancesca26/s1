package problema12;

public class AutobuzHandler extends Handler {
    public AutobuzHandler(Handler nextHandler, int prag) {
        super(nextHandler, prag);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta){

        if(distanta<prag){
            System.out.println("te poti deplasa cu autobuzul");
        }
        else{
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
