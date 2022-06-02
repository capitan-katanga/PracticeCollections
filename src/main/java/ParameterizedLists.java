import java.util.ArrayList;

public class ParameterizedLists {
    public static void main(String[] args) {

        // En los arrays parametrizados se define el tipo de datos que almacenara el array.
        // No es posible almacenar otro tipo de dato que el especificado entre <>
        ArrayList<Card> cardsList = new ArrayList<>();

        cardsList.add(new Card("Honda", "Civic", 2100));
        cardsList.add(new Card("Toyota", "Camry", 2900));
        cardsList.add(new Card("BMW", "X6", 60000));

        System.out.println("Cards list " + cardsList);

        // No se puede pasar un tipo de dato primitivo como parametro a un array
        ArrayList<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(341);
        arrayInt.add(641);
        arrayInt.add(531);
        arrayInt.add(871);
        // Se pueden asignar una referencia null como elemento en el array.
        // Ya que la clase Integer no deja de ser un tipo de objeto
        arrayInt.add(null);

        ArrayList<Integer> anotherArrayInt = new ArrayList<>();
        anotherArrayInt.add(329);
        anotherArrayInt.add(139);
        anotherArrayInt.add(219);

        // Se pueden agregar los elementos de un array a otro array
        arrayInt.addAll(anotherArrayInt);
        arrayInt.add(235);

        // Se pueden saber si los elementos de un array estan dentro de otro array
        System.out.println(arrayInt.containsAll(anotherArrayInt));

        System.out.println(arrayInt);
        // Se pueden eliminar elementos de un array desde otro array
        arrayInt.removeAll(anotherArrayInt);
        System.out.println(arrayInt);

    }
}
