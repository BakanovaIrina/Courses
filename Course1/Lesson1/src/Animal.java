public abstract class Animal{
    private String name;
    private static int howMany = 0;

    Animal(String name){
        this.name = name;
        howMany = howMany +1;
    }

    public String getName() {
        return name;
    }

    public static void printHowMany(){
        System.out.println("Всего животных было создано: " + howMany);
    }

    public abstract void run(int length);

    public abstract void swim(int length);
}