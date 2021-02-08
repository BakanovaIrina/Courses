import java.util.Arrays;

public class Main {
    static final int SIZE = 1000000;
    static final int HALF = SIZE / 2;

    public static void method1(){
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        System.out.println("Время выполнения первого метода: " + (System.currentTimeMillis() - a) + " миллисекунд");
    }

    public static void method2 () {
        final float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        Thread part1 = new Thread() {
            public void run() {
                for (int i = 0; i < arr.length / 2; i++)
                    arr[i] = 1;
                for (int i = 0; i < arr.length / 2; i++)
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
            }
        };
        Thread part2 = new Thread(){
            public void run() {
                for (int i = arr.length / 2; i < arr.length; i++)
                    arr[i] = 1;
                for (int i = arr.length / 2; i < arr.length; i++)
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
            }
        };
        part1.start();
        part2.start();

        try {
            part1.join();
            part2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Время выполнения второго метода: " + (System.currentTimeMillis() - a) + " миллисекунд");
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
