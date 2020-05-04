import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        //Person person1 = new Person()
        Map<Integer, String> artist = new HashMap<>();
        artist.put(1, "RZA");
        artist.put(2, "GZA");
        artist.put(3,"DejLoaf");
        artist.put(4,"LedZepplin");

        System.out.println(artist.entrySet());
        System.out.println(artist.keySet());
        System.out.println(artist.remove(3));
        // Loop through the hash map  and print the keys and values
        for (Map.Entry<Integer, String> entry: artist.entrySet()) {
            System.out.println(entry);
        }

        for(Integer key: artist.keySet()){
            System.out.println();
        }
        Iterator<Map.Entry<Integer, String>> iterator = artist.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator<Integer> iterator1 = artist.keySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
