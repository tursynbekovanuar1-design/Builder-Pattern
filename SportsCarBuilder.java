package builder;

public class SportsCarBuilder implements CarBuilder {

    private String engine;
    private String color;
    private String wheels;
    private int seats;

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Car build() {
        CarValidator.validate(engine, color, wheels, seats);

        return new Car(engine, color, wheels, seats);
    }
}
