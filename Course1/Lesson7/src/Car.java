
public class Car implements Runnable {
    public static boolean hasWinner = false;
    private static int CARS_COUNT;
    private Object mon = new Object();
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            Main.latchStart.countDown();
            Main.latchStart.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        System.out.println(name + " закончил гонку");
        synchronized (mon){
            if (!hasWinner){
                hasWinner = true;
                System.out.println(name + " выиграл гонку!");
            }
        }
        Main.latchRace.countDown();
    }
}
