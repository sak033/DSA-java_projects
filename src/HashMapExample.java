
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String []args) {
        // Country(key), Population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insert
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        //print
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //search
        if (map.containsKey("China")) {
            System.out.println("key Present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        //search for both key and value
        //get()
        System.out.println(map.get("China"));  //key exists
        System.out.println(map.get("Indonesia"));  //key not exists

        //Iterate way 1
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iterate way 2
        Set<String>keys = map.keySet();
        for(String k:keys){
            System.out.println(k+" "+map.get(k));
        }

        //remove
        map.remove("China");
        System.out.println(map);
    }
}
