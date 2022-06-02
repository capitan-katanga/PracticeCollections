import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

public class ArraysLists {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        // ArrayList es una clase perteneciente al paquete java.util
        System.out.println("ArrayList class: " + arrayList.getClass()); // class java.util.ArrayList

        // Los ArrayList pertenecen a una jerarquia de interfaces, donde ArrayList implementa List a su vez Lista implmenta de Collection y Collection de Iterable
        System.out.println(arrayList instanceof List);
        System.out.println(arrayList instanceof Collection);
        System.out.println(arrayList instanceof Iterable);

        //Devuelve true si el arraylist esta vacio.
        System.out.println("El arrayList esta vacio " + arrayList.isEmpty());

        arrayList.add("Moto");
        arrayList.add("Auto");
        arrayList.add("Camion");
        arrayList.add("Bicicleta");

        // El metodo toString devuelve todos los elementos de la array
        System.out.println(arrayList);
        // Cantidad de elementos que tiene el array
        System.out.println(arrayList.size());
        System.out.println("El arrayList esta vacio " + arrayList.isEmpty());

        // Eliminar un objeto especifico del array
        arrayList.remove("Auto");
        // Eliminar por un indice dado
        // Eliminar segundo elemento del array
        arrayList.remove(1);

        // Saber si un elemento existe dentro del array
        System.out.println("Existe el elemento Auto: " + arrayList.contains("Auto"));
        System.out.println("Existe el elemento Bicicleta: " + arrayList.contains("Bicicleta"));


        // Como en el array no se especifica el tipo de objeto que se va a almacenar, esta permitido agregar
        // elemntos de cualquier tipo

        arrayList.add(1);
        arrayList.add(Calendar.getInstance().getTime());
        arrayList.add(1.3);
        arrayList.add(true);

        // Se pueden acceder a los elementos del array a travez de sus indices
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Tipo de dato: " + arrayList.get(i).getClass());
            System.out.println("Dato " + arrayList.get(i));
        }


    }
}
