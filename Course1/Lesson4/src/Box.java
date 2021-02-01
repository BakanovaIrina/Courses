import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    Box(){
        fruits = new ArrayList<>();
    }

    Box(T ... fruit){
        fruits.addAll(Arrays.asList(fruit));
    }

    public void add(T ... fruit){
        fruits.addAll(Arrays.asList(fruit));
    }

    public float getWeight(){
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compire(Box<T> anotherBox){
        try {
            if (this == anotherBox)
                throw new StupidBoxException();
        } catch (StupidBoxException e){
            e.printStackTrace();
        }
        return Math.abs(anotherBox.getWeight() - this.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> anotherBox) throws TransferEmptyBoxException, StupidBoxException{
        if (this == anotherBox){
            throw new StupidBoxException();
        }
        if (this.fruits.isEmpty())
            throw new TransferEmptyBoxException();
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
