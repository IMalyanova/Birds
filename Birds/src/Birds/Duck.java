package Birds;

public class Duck extends FlyingBird {


    public void swim(){

    }

    public void catchFish(){

    }

    public void eat(){
        catchFish();
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("kria! kriaa! my weight is " + weight);
    }

}
