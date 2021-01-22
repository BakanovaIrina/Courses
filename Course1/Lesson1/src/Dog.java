public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 500){
            System.out.println(getName() + " пробежал " + length +" метров");
        }
        else {
            System.out.println(getName() + " не может пробежать так много!");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10){
            System.out.println(getName() + " проплыл " + length +" метров");
        }
        else {
            System.out.println(getName() + " не может проплыть так много!");
        }
    }
}