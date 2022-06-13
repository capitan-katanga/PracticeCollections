import java.util.HashSet;

public class ObjectHashSet {
    public static void main(String[] args) {
        HashSet<Car> carHashSet = new HashSet<>();
        carHashSet.add(new Car("Nissan", "March", 1600));
        carHashSet.add(new Car("Honda", "Civic", 2100));
        carHashSet.add(new Car("Toyota", "Camry", 2900));
        carHashSet.add(new Car("BMW", "X6", 60000));
        carHashSet.add(new Car("Fiat", "500", 19000));
        carHashSet.add(new Car("Fiat", "500", 19000));

        // Al no estar implementado el metodo equals y hash en la clase Car, los dos ultimos elementos agregado no son iguales.
        System.out.println(carHashSet);

        // Product si implementa los metodos equals y hashCode
        HashSet<Product> productHashSet = new HashSet<>();
        productHashSet.add(new Product("iPhone", "Electronics"));
        productHashSet.add(new Product("Samsung", "Electronics"));
        productHashSet.add(new Product("Nike", "Footweat"));
        productHashSet.add(new Product("Epson", "Computer Accesories"));
        productHashSet.add(new Product("Epson", "Computer Accesories"));

        // El producto Epson se visualiza una sola vez.
        System.out.println(productHashSet);


    }
}
