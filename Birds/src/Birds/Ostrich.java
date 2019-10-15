package Birds;

public class Ostrich extends NotFlyBird {

    public Ostrich(){
        this.weight = weight + 1_500 + 100_000 * Math.random();
    }

    public void voice() {
        System.out.println("u-u-uuuuuuu! my weight is " + weight);
    }
}
