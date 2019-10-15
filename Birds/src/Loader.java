import Birds.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class Loader {
    public static void main(String[] args) {

        ArrayList<Vertebrata> animals = new ArrayList<>();
        addAnimals(animals);

        Collections.sort(animals);


        for (Vertebrata element: animals){
            element.voice();
        }
    }

    private static void addAnimals(ArrayList<Vertebrata> animals) {
        animals.add(new Frog());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
    }
}
