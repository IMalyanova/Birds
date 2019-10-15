package Birds;

public class Hen extends FlyingBird {
    public void dabGrains(){

    }

    public void eat(){
        dabGrains();
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("ko-ko-ko-ko! my weight is " + weight);
    }


}
