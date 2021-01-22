public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");
        Tiger tiger = new Tiger("Полосатик");

        Animal array[] = {cat, dog, tiger};

        for (Animal i: array){
            i.run(500);
            i.swim(5);
        }

        Animal.printHowMany();
    }
}
