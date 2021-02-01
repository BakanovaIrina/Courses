import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void changeElements(Object[] array, int firstElement, int secondElement){
        Object t = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = t;
    }

    public static <T> ArrayList<T> convertToArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        //Task1

        Integer[] a = {1, 2, 3, 4, 5};
        changeElements(a, 0, 1);

        //Task2

        ArrayList<?> b = convertToArrayList(a);

        //Task3

        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();


        box.add(apple3, apple4);
        box1.add(orange1, orange2, orange3, orange4);
        box2.add(apple1, apple2);


        boolean compire = box.compire(box1);

        try {
            box.transfer(box2);
        } catch (TransferEmptyBoxException | StupidBoxException e){
            e.printStackTrace();
        }
    }
}
