public class Robot implements Contestant {
    private final String name;
    boolean canDoActions = true;
    private final int maxCanRun;
    private final int maxCanJump;

    Robot(String name, int maxCanRun, int maxCanJump){
        this.name = name;
        this.maxCanRun = maxCanRun;
        this.maxCanJump = maxCanJump;
    }

    public void run(RunningTrack track) {
        if (!canDoActions){
            return;
        }
        if (maxCanRun > track.getLength()){
            System.out.println("Робот " + name + " успешно пробежал " + track.getLength() + " метров");
        }
        else {
            System.out.println("Робот " + name + " не смог пробежать " + track.getLength() + " метров");
            canDoActions = false;
            System.out.println("Робот " + name + " провалил испытание");
        }
    }

    public void jump(Wall wall){
        if (!canDoActions){
            return;
        }
        if (maxCanJump > wall.getHeight()){
            System.out.println("Робот " + name + " успешно перепрыгнул стену в " + wall.getHeight() + " метров");
        }
        else {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену в " + wall.getHeight() + " метров");
            canDoActions = false;
            System.out.println("Робот " + name + " провалил испытание");
        }
    }
}
