import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void findUniqueWords(String ... words){
        ArrayList<String> list = new ArrayList(Arrays.asList(words));
        System.out.println("Список уникальных слов:");
        for (int i = 0; i < list.size(); i++){
            if (list.indexOf(words[i]) == list.lastIndexOf(words[i])){
                System.out.println(list.get(i));
            }
        }
    }

    public static void countWords(String ... words){
        ArrayList<String> list = new ArrayList(Arrays.asList(words));
        int k = 0;
        while (!list.isEmpty()){
            String word = list.get(0);
            k++;
            list.remove(list.lastIndexOf(word));
            if (list.lastIndexOf(word) == -1){
                System.out.println(word + " встречается " + k + " раз");
                k = 0;
            }
        }
    }

    public static void main(String[] args) {

        //Task1

        String[] animals = {"Cat", "Dog", "Monkey", "Dog", "Panda", "Hours", "Panda", "Panda", "Tiger", "Monkey"};
        findUniqueWords(animals);
        countWords(animals);

        //Task2
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Ivanov", 79272722727l);
        telephoneDirectory.add("Smirnov", 7994942727l);
        telephoneDirectory.add("Ivanov", 79235363727l);

        System.out.println(telephoneDirectory.get("Ivanov"));

    }
}
