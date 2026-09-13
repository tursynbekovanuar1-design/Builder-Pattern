package builder;

public class Car {

    private final String engine;
    private final String color;
    private final String wheels;
    private final int seats;

    public Car(String engine, String color, String wheels, int seats) {
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels='" + wheels + '\'' +
                ", seats=" + seats +
                '}';
    }
}
