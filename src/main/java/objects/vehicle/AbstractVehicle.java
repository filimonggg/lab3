package objects.vehicle;

import objects.PhysicalObject;
import interfaces.Vehicle;
import enums.VehicleColor;
import enums.VehicleType;
import objects.place.AbstractPlace;

import java.util.Objects;

public abstract class AbstractVehicle extends PhysicalObject implements interfaces.Vehicle {

    protected VehicleType vehicleType;
    protected int height;
    protected int width;
    protected int length;
    protected VehicleColor vehicleColor;

    public AbstractVehicle(String name, VehicleType vehicleType, int height, int width, int length, VehicleColor vehicleColor) {
        super(name);
        this.vehicleType = vehicleType;
        this.height = height;
        this.width = width;
        this.length = length;
        this.vehicleColor = vehicleColor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void move(AbstractPlace start, AbstractPlace finish) {
        if (Objects.equals(finish, null)) {
            System.out.println(name + " отъехал от " + start.getName());
        } else if (Objects.equals(start, null)) {
            System.out.println(name + " приехал в " + finish.getName());
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        AbstractVehicle other = (AbstractVehicle) obj;
        return height == other.height &&
                vehicleType == other.vehicleType &&
                width == other.width &&
                length == other.length &&
                vehicleColor == other.vehicleColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vehicleColor, height, width, length, vehicleColor);
    }

    @Override
    public String toString() {
        return "objects.AbstractVehicle{name:'" + name + "', vehicleColor:'" + vehicleColor + "', height:'" + height +
                "', width:'" + width + "', length:'" + length + "', vehicleColor:'" + vehicleColor + "'}";
    }
}
