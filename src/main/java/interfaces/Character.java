package interfaces;

import enums.PlaceLocation;
import objects.PhysicalObject;
import objects.place.AbstractPlace;

public interface Character {
    void walk(AbstractPlace start, AbstractPlace finish);
    void see(PhysicalObject target);
    void notSee(PhysicalObject target);
    void sleep();
    void notSleep(int days);
}
