public class Tiger extends Animal{
    Tiger(String name){
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 800){
            System.out.println(getName() + " пробежал " + length +" метров");
        }
        else {
            System.out.println(getName() + " не может пробежать так много!");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 20){
            System.out.println(getName() + " проплыл " + length +" метров");
        }
        else {
            System.out.println(getName() + " не может проплыть так много!");
        }
    }
}