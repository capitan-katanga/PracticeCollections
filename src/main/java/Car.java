public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int price;

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Card{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", price='" + price + '\'' + '}';
    }

    @Override
    public int compareTo(Car car) {
        return car.make.compareTo(this.make);
    }
}
