import java.util.*;

public class OtherSets {

    public static void main(String[] args) {

        String[] carsArray = {"Volvo", "BMW", "Honda", "Audi", "Mercedes", "Toyota", "Honda", "Fiat", "Nissan", "Chevrolet"};

        // Version del HashSet ordenada, nos permite iterar a través de los elementos en el orden en que fueron insertados.
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carsArray));
        System.out.println("linkedHashSet instanceof LinkedHashSet " + (linkedHashSet instanceof LinkedHashSet));
        System.out.println("linkedHashSet instanceof HashSet " + (linkedHashSet instanceof HashSet));
        System.out.println("linkedHashSet instanceof Set " + (linkedHashSet instanceof Set));
        System.out.println("linkedHashSet instanceof Collection " + (linkedHashSet instanceof Collection));
        System.out.println("linkedHashSet instanceof Iterable " + (linkedHashSet instanceof Iterable));

        // Utiliza un árbol de búsqueda binaria autoequilibrado, más específicamente un árbol rojo-negro.
        Set<String> treeSet = new TreeSet<>(Arrays.asList(carsArray));
        System.out.println("treeSet instanceof  TreeSet " + (treeSet instanceof TreeSet));
        System.out.println("treeSet instanceof  SortedSet " + (treeSet instanceof SortedSet));
        System.out.println("treeSet instanceof  Set " + (treeSet instanceof Set));
        System.out.println("treeSet instanceof  Collection " + (treeSet instanceof Collection));
        System.out.println("treeSet instanceof  Iterable " + (treeSet instanceof Iterable));

        // Se visualizan los elementos en el orden en el que fueron insertados
        System.out.println("linkedHashSet" + linkedHashSet);

        // Se visualizan los elementos en orden alfabetico (En su orden natural)
        System.out.println("treeSet" + treeSet);

        // Brinda metodos para acceder a elementos del treeSet, segun cierto orden
        SortedSet<String> sortedSetCars = new TreeSet<>(treeSet);

        // Acceder al primer elemento
        System.out.println("First element: " + sortedSetCars.first());
        // Acceder al ultimo elemento
        System.out.println("Last element: " + sortedSetCars.last());

        // Acceder a los elementos anteriores a
        System.out.println("Before: Honda -> " + sortedSetCars.headSet("Honda"));

        // Acceder a los elementos posteriores a
        System.out.println("After: Honda -> " + sortedSetCars.tailSet("Honda"));

        // Acceder a los elementos dentro de un rango
        System.out.println("Between Fiat and Toyota -> " + sortedSetCars.subSet("Fiat", "Toyota"));


        // Se puede usar la interfaz Comparator para establecer un ordenamiento personalizado.
        Comparator<String> inverterOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        // Se crear el objeto invertedSortedSetCars y se pasa como parametro el objeto Comparator.
        SortedSet<String> invertedSortedSetCars = new TreeSet<>(inverterOrder);
        invertedSortedSetCars.addAll(Arrays.asList(carsArray));
        System.out.println("Inverted order: -> " + invertedSortedSetCars);


        // Se puede implementar la interfaz Comparable en el objeto que se desea ordenar
        SortedSet<Car> sortedSetCarsCompareTo = new TreeSet<>();
        sortedSetCarsCompareTo.add(new Car("Nissan", "March", 1600));
        sortedSetCarsCompareTo.add(new Car("Honda", "Civic", 2100));
        sortedSetCarsCompareTo.add(new Car("Toyota", "Camry", 2900));
        sortedSetCarsCompareTo.add(new Car("BMW", "X6", 60000));
        sortedSetCarsCompareTo.add(new Car("Fiat", "500", 19000));

        // Estan ordenados alfabeticamente invertidos por el nombre de la marca.
        System.out.println(sortedSetCarsCompareTo);





    }
}
