package objects.character;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import objects.PhysicalObject;
import objects.place.AbstractPlace;
import enums.WeatherType;
import exceptions.WeatherException;
import objects.place.Hold;

import java.util.Objects;

public class Korotishki extends AbstractCharacter {

    public Korotishki(String name, int intellect, int height, int strength, String sex) {
        super(name, intellect, height, strength, sex);
    }

    @Override
    public void walk(AbstractPlace start, AbstractPlace finish) {
        if (Objects.equals(finish, null)) {
            System.out.println("выпустили из " + start.getCondition() + " " + start.getName());
        } else if (Objects.equals(start, null)) {
            System.out.println("впустили в " + finish.getCondition() + " " + finish.getName());
        }

    }

    @Override
    public void see(PhysicalObject target) {
        System.out.println(name + "видели уже " + target.getName());
    }

    @Override
    public void notSee(PhysicalObject target) {
        System.out.println(name + ", до того и вблизи не видели " + target.getName() + ", ");
    }

    @Override
    public void sleep() {
        System.out.println(name + "спят");
    }

    @Override
    public void notSleep(int days) {
        System.out.println(name + " не могли заснуть в течении " + days + " суток ни на минуту и к концу плавания еле на ногах держались");
    }

    public void scare() {
        System.out.println(name + " боялись, что ");
    }

    public void tired() {
        System.out.println("измученные " + name + " ");
    }

    public void study(WeatherType weatherType) throws WeatherException {
        if (weatherType == WeatherType.HOT || weatherType == WeatherType.COLD) {
            throw new WeatherException(name + " не могут учиться в такую погоду!");
        }
        intellect += 10;
        System.out.println(name + " хорошо поучились сегодня!");
    }

    public void work(WeatherType weatherType) throws WeatherException {
        if (weatherType == WeatherType.RAIN) {
            throw new WeatherException(name + " не могут работать в такую погоду!");
        }
        strength += 10;
        System.out.println(name + " хорошо поработали сегодня!");
    }
}

