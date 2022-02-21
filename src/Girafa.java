public class Girafa extends animal{
    public Girafa(String nume){
        super(nume);
    }
    @Override
    public void mananca(String tipMancare) {
        System.out.println("Girafa"+ getNume()+tipMancare);
    }
}
