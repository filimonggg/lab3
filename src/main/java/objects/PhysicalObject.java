package objects;

import java.util.Objects;

public abstract class PhysicalObject {
    protected String name;

    public PhysicalObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhysicalObject other = (PhysicalObject) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "objects.PhysicalObject{name:'" + name + "'}";
    }

}
