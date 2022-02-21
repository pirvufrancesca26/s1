public abstract class animal {
    private String nume;

    public abstract void mananca(String tipMancare);
public String getNume() {
    return nume;
}
public void setNume() {
    this.nume=nume;
}
public animal(String nume) {
    this.nume=nume;
}
}
