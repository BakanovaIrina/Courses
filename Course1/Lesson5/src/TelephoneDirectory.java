import java.util.*;

public class TelephoneDirectory {
    private HashMap<String, TreeSet<Long>> directory = new HashMap<String, java.util.TreeSet<Long>>();

    public void add(String name, Long number){
        if (!directory.containsKey(name)){
            directory.put(name, new TreeSet<Long>(Arrays.asList(number)));
        }
        directory.get(name).add(number);
    }

    public Set get(String name){
        return directory.get(name);
    }
}
