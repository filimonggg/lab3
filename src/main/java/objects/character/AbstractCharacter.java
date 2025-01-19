package objects.character;

import interfaces.Character;
import objects.PhysicalObject;
import objects.place.AbstractPlace;

import java.util.Objects;

public abstract class AbstractCharacter extends PhysicalObject implements Character {

    protected int height;
    protected int strength;
    protected int intellect;
    protected String sex;

    public AbstractCharacter(String name, int intellect, int height, int strength, String sex) {
        super(name);
        this.intellect = intellect;
        this.height = height;
        this.strength = strength;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        AbstractCharacter other = (AbstractCharacter) obj;
        return Objects.equals(sex, other.sex) &&
                height == other.height &&
                strength == other.strength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, strength, sex);
    }

    @Override
    public String toString() {
        return "objects.AbstractVehicle{name:'" + name + "', height:'" + height + "', strength:'" + strength + "', " +
                "sex:'" + sex + "'}";
    }
}
