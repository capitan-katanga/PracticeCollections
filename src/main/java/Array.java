import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Los arrays puede almacenar datos de un mismo tipo.
        // La longitud del array se define al momento de se creacion y no se puede cambiar.
        int[] arrayInt = new int[6];
        arrayInt[0] = 654; // El indice 0 es la rimera posicion del array.
        arrayInt[1] = 123;
        arrayInt[2] = 432;
        // Los elementos no asignados quedan en 0 para los tipos primitivos numericos.
        arrayInt[4] = 324;
        // Con el metodo toString de la clase Array, podemos ver el valor de los elementos del array.
        System.out.println(Arrays.toString(arrayInt));

        String[] arrayString = new String[4]; // El 4 es la cantidad de elementos que contiene.
        arrayString[0] = "Hola";
        arrayString[1] = "Mundo";
        arrayString[2] = "!";
        // Los elementos no asignados quedan en Null cuando son de tipo objeto.
        System.out.println(Arrays.toString(arrayString));

        float[] arrayFloat = new float[5];
        boolean[] arrayBoolean = new boolean[2];
        // El valor que devuelve getClass es class seguido de un corchete
        System.out.println(arrayInt.getClass()); // class [I
        // En caso de un valor de tipo objecto, se agrega ; al final.
        System.out.println(arrayString.getClass()); // class [Ljava.lang.String;
        System.out.println(arrayFloat.getClass()); // class [F
        System.out.println(arrayBoolean.getClass()); // class [Z

        System.out.println(arrayFloat.length); // Cantidad de elementos de un array.
        System.out.println(arrayFloat.length - 1); // Es la ultima posicion del array.

        // Hay dos maneras de crear un array de longitud 0

        String[] array0 = new String[0];
        String[] otherArray0 = {};

        System.out.println(array0.length);
        System.out.println(otherArray0.length);

        // Se puede crear el array y asignarles valores a sus elementos en una sola instruccion.
        String[] arrayEmpresas = {"Hitachi", "Nissan", "Sony", "Nintendo", "Sega", "Toyota"};

        // Los indices no pueden ser numero negativos.
        // System.out.println(arrayEmpresas[-1]); // Lanza una excepcion -> ArrayIndexOutOfBoundsException

        //Estructuras repetitivas para recorrer un array

        // For loop
        // Se reccore el vector completo sabiendo su tamaño
        for (int i = 0; i < arrayEmpresas.length; i++) {
            System.out.println(arrayEmpresas[i]);
        }

        //For each
        // Se recorre el vector completo y se accede a cada valor a traves de la variable empresa
        for(String empresa : arrayEmpresas){
            System.out.println(empresa);
        }


    }
}
