package Birds;

public class Vertebrata implements Comparable<Vertebrata> {

    protected double weight;

    protected Vertebrata(){
        weight = 10 + 100 * Math.random();
    }

    private void ingest(){

    }
    protected void digest(){

    }

    protected void eat(){
        ingest();
        digest();
    }
    protected void move(){}
    public void voice(){}

    @Override
    public int compareTo(Vertebrata vertebrata) {
        return (int)Math.round(vertebrata.weight - this.weight);
    }
}
