public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 200){
            System.out.println(getName() + " пробежал " + length +" метров");
        }
        else {
            System.out.println(getName() + " не может пробежать так много!");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(getName() + " не умеет плавать!");
    }
}