package objects.place;

import objects.PhysicalObject;
import enums.PlaceLocation;
import objects.vehicle.AbstractVehicle;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractPlace extends PhysicalObject {

    protected String condition;
    protected PlaceLocation placeLocation;

    public AbstractPlace(String name, String condition, PlaceLocation placeLocation) {
        super(name);
        this.condition = condition;
        this.placeLocation = placeLocation;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        AbstractPlace other = (AbstractPlace) obj;
        return Objects.equals(condition, other.condition) &&
                placeLocation == other.placeLocation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), condition, placeLocation);
    }

    @Override
    public String toString() {
        return "objects.AbstractVehicle{name:'" + name + "', condition:'" + condition + "', placeLocation:'" + placeLocation + "'}";
    }

    public class Scene {
        private ArrayList<AbstractPlace> places;

        public Scene() {
            this.places = new ArrayList<>();
        }

        public void addPlace(AbstractPlace place) {
            places.add(place);
        }

        public void removePlace(AbstractPlace place) {
            places.remove(place);
        }

        public void viewAll() {
            for (AbstractPlace place: places) {
                System.out.println(place.getName());
            }
        }
    }
}
