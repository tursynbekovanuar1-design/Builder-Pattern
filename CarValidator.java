package builder;

public class CarValidator {

    public static void validate(
            String engine,
            String color,
            String wheels,
            int seats) {

        if (engine == null || engine.isBlank()) {
            throw new IllegalStateException("Engine is required");
        }

        if (color == null || color.isBlank()) {
            throw new IllegalStateException("Color is required");
        }

        if (wheels == null || wheels.isBlank()) {
            throw new IllegalStateException("Wheels are required");
        }

        if (seats <= 0) {
            throw new IllegalStateException("Seats must be greater than 0");
        }
    }
}
