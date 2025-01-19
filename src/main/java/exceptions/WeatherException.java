package exceptions;

public class WeatherException extends Exception {
    public WeatherException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка выполнения из-за погоды " + super.getMessage();
    }
}
