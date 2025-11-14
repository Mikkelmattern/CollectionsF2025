package entities;

import java.util.Objects;

public class Creature implements Comparable<Creature>{
    private String type;
    private int age;
    private int id;

    public Creature(String type, int age, int id) {
        this.type = type;
        this.age = age;
        this.id = id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, age, id);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Creature other = (Creature) obj;
        return Objects.equals(type, other.type) && age == other.age && id == other.id;
    }
    @Override
    public int compareTo(Creature o){
        if ( o == this) return 0;
        if (o == null) return 1;

        if (this.id > ((Creature) o).id) return 1;
        if (this.id < ((Creature) o).id) return -1;
        if (this.type.compareTo(((Creature) o).type) != 0) return this.type.compareTo(((Creature) o).type);
        if (this.age > ((Creature) o).age) return 1;
        if (this.age < ((Creature) o).age) return -1;
        return 0;

    }
    @Override
    public String toString() {
        return "Creature [type=" + type + ", age=" + age + ", id=" + id + "]";
    }
}