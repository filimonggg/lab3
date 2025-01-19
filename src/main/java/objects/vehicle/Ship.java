package objects.vehicle;

import enums.PlaceLocation;
import enums.VehicleColor;
import enums.VehicleType;
import interfaces.Vehicle;
import objects.PhysicalObject;
import objects.place.AbstractPlace;

import java.util.Objects;

public class Ship extends AbstractVehicle {

    public Ship(String name, VehicleType vehicleType, int height, int width, int length, VehicleColor vehicleColor) {
        super(name, vehicleType, height, width, length, vehicleColor);
    }

    public void waves(int days) {
        System.out.println(days + " дня и " + days + " ночи " + name + " бросало по волнам.");
    }

    @Override
    public void notCrushed() {
        System.out.println(name + " держится на воде уверенно");
    }

    @Override
    public void crushed() {
        System.out.println(name + " вот-вот опрокинется и пойдет ко дну");
    }

    @Override
    public void move(AbstractPlace start, AbstractPlace finish) {
        if (Objects.equals(finish, null)) {
            System.out.println(name + " отчалил от " + start.getName() + " и началось плавание. Путь был долог и труден.");
        } else if (Objects.equals(start, null)) {
            System.out.println(name + " вошел в " + finish.getCondition() + " " + finish.getName());
        }
    }
}
