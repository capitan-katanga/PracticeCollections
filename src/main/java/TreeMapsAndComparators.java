import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapsAndComparators {
    public static void main(String[] args) {
        // Equivalente a treeSet
        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1784, "The Godfather");
        treeMap.put(1202, "Titanic");
        treeMap.put(1503, "Jaws");
        treeMap.put(1501, "Saving Private Ryan");
        treeMap.put(2501, "Back to the Future");
        treeMap.put(3000, "Parasite");
        treeMap.put(4000, "It's a Beautiful life");

        // Muestra lo elementos ordenados por clave
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        // Se puede usar un coparator para establecer un orden especifico
        Comparator<Integer> descending = new Comparator<Integer>() {
            @Override
            public int compare(Integer o, Integer t1) {
                return t1.compareTo(o);
            }
        };
        Map<Integer,String> invertedTreeMpa = new TreeMap<>(descending);
        invertedTreeMpa.putAll(treeMap);
        System.out.println(invertedTreeMpa);
    }
}
