public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(10);
        Wall wall1 = new Wall(1);
        RunningTrack runningTrack = new RunningTrack(200);
        RunningTrack runningTrack1 = new RunningTrack(2000);

        Block[] blocks = {wall, wall1, runningTrack, runningTrack1};

        Human human = new Human("Вася", 5000, 2);
        Cat cat = new Cat("Мурзик", 10000, 1);
        Robot robot = new Robot("Жанна2020", 10000000, 100);

        Contestant[] contestants = {human, cat, robot};

        for (Contestant contestant : contestants){
            for(Block block : blocks){
                block.block(contestant);
            }
        }

    }
}
