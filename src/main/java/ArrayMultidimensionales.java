import java.util.Arrays;
import java.util.Random;

public class ArrayMultidimensionales {
    public static void main(String[] args) {
        // Lo array multidimensionales se declaran agregando par de corchetes al lado del tipo de dato.
        // Ejemplo de como seria una matriz de 2x2
        int[][] matriz = new int[2][2];
        // El primer par de corchetes se podria considerar como filas y el segundo como columnas.

        matriz[0][0] = 14;
        matriz[0][1] = 23;
        matriz[1][0] = 54;
        matriz[1][1] = 32;

        // Estructura para recorrer la matriz
        // Imprime el vector que hay en cada fila
        for (int[] filas : matriz) {
            System.out.println(Arrays.toString(filas));
        }

        // Jagged array
        // Vector de vectores, las filas no tienen la misma longitud
        // No es necesario declarar la longitud de las filas
        String[][] jaggedArray = new String[3][];

        // Para asignar valores a sus elementos se deben declarar la longitud de cada fila
        jaggedArray[0] = new String[1];
        jaggedArray[1] = new String[2];
        jaggedArray[2] = new String[3];

        // Para asignar valores random se debe usar un for loop
        // La longitud de array es su cantidad de filas
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = String.valueOf(new Random().nextInt(9));
            }
        }

        for (String[] filas : jaggedArray) {
            System.out.println(Arrays.toString(filas));
        }


    }
}
