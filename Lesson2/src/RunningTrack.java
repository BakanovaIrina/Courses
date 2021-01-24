public class RunningTrack implements Block {
    private int length;

    RunningTrack(int length){
        if (length > 0){
            this.length = length;
        }
        else {
            System.out.println("Размеры беговой дорожки неверные. Длинна будет установлена в 1000км.\n Если хотите это изменить, воспользуйтесь сеттером");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void block(Contestant contestant) {
        contestant.run(this);
    }
}
