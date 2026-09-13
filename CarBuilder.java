package builder;

public interface CarBuilder {

    CarBuilder setEngine(String engine);

    CarBuilder setColor(String color);

    CarBuilder setWheels(String wheels);

    CarBuilder setSeats(int seats);

    Car build();
}
