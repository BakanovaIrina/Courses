public class Wall implements Block {
    private int height;

    Wall(int height){
        if (height > 0){
            this.height = height;
        }
        else {
            System.out.println("Размеры стены неверные. Длинна будет установлена в 10м.\n Если хотите это изменить, воспользуйтесь сеттером");
            this.height = 10;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void block(Contestant contestant) {
        contestant.jump(this);
    }
}
