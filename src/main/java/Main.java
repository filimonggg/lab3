import enums.PlaceLocation;
import enums.VehicleColor;
import enums.VehicleType;
import enums.WeatherType;
import exceptions.WeatherException;
import objects.character.Korotishki;
import objects.character.KorotishkiRecord;
import objects.place.Bay;
import objects.place.Beach;
import objects.place.Hold;
import objects.place.Sea;
import objects.vehicle.Ship;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public Main() {
    }

    public static void main(String[] args) {
        Hold hold = new Hold("трюм", "сырой, мрачный", PlaceLocation.INDOOR);
        Sea sea = new Sea("море", null, PlaceLocation.WATER);
        Beach beach = new Beach("берег", null, PlaceLocation.GROUND);
        Bay bay = new Bay("бухта", "спокойная, тихая", PlaceLocation.WATER);
        Ship ship = new Ship("корабль", VehicleType.WATER, 127, 10, 10, VehicleColor.BLACK);
        Korotishki korotishki = new Korotishki("Коротышки", 70, 100, 50, "male");
        WeatherType[] weatherType = WeatherType.values();
        Random random = new Random();
        KorotishkiRecord name, intellect, strength = new KorotishkiRecord("Коротышки", 70, 50);

        for (int day = 1; day < 5; day++){
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
            WeatherType weather = weatherType[random.nextInt(weatherType.length)];
            logger.info("День: {}", day);
            logger.info("Погода: {}", weather);
            try {
                korotishki.study(weather);
            } catch (WeatherException err) {
                logger.error(err.getMessage());
            }
            try {
                korotishki.work(weather);
            } catch (WeatherException err) {
                logger.error(err.getMessage());
            }

            if (day == 1) {
                ship.move(beach, null);
            } else if (day == 2) {
                ship.waves(day);
                korotishki.notSee(sea);
                korotishki.scare();
                ship.crushed();
                korotishki.notSleep(day);
            } else if (day == 3) {
                ship.move(null, bay);
                korotishki.tired();
                korotishki.walk(hold, null);
            }
        }
    }
}