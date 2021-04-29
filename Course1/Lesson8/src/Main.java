import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>(Arrays.asList(
                new Worker("Bob1", 90, 100000),
                new Worker("Bob2", 25, 100000),
                new Worker("Bob3", 67, 120000),
                new Worker("Bob4", 32, 100000)
        ));

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("кот", "пирог", "кот", "зарплата", "кот", "собака",
                "попугай", "кот", "пирог"));

        firstTask(wordList);
        secondTask(workers);
        thirdTask(workers, 2);
    }

    public static void firstTask(ArrayList<String> wordList){
        String result = wordList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(o -> o.getValue())).get().getKey();
        System.out.println(result);
    }

    public static void secondTask(ArrayList<Worker> workers){
        OptionalDouble average = workers.stream().mapToInt(bob -> bob.getSalary()).average();
        System.out.println("Средняя зарплата работников: " + average.getAsDouble());

    }

    public static void thirdTask(ArrayList<Worker> workers, int n){
        System.out.println(n + "самых старших работников:");
        workers.stream()
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .limit(n).map(Worker::getName)
                .forEach(System.out::println);
    }
}
