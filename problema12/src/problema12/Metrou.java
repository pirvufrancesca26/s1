package problema12;

public class Metrou extends Handler{
    public Metrou(int prag) {
        super(prag);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        System.out.println("Te poti deplasa cu metroul");
    }

    public Metrou() {
        super(0);
    }
}
