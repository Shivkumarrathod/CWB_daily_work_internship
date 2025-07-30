import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        //map:key value pair , keys are always unique
        //Map:TreeMap,HashMap,HashTable,LinkedHashMap
        
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(101,"Ram");
        map.put(102,"Shyam");
        map.put(106,"gyan");
        map.put(104,"ryan");
        // map.put(null,"ryan"); not possible
        System.out.println(map);

        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(101,"Ram");
        map1.put(102,"Shyam");
        map1.put(106,"gyan");
        map1.put(104,"ryan");
        System.out.println(map1);

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(101,"Ram");
        map2.put(102,"Shyam");
        map2.put(106,"gyan");
        map2.put(104,"ryan");
        map2.put(null,"ssnuk");//allowed
        System.out.println(map2);
    }
}
