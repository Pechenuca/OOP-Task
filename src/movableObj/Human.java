package movableObj;

import Exceptions.NegativeAgeException;
import places.Place;

import java.util.Objects;

abstract class Human implements MovablePerson  {
    abstract String dying();
    private int age;
    protected Place location;
    protected String name;
    public Human(Place location, String name, int age) {
        this.location = location;
        this.name = name;
        this.name = name;
        this.age = age;
        if(age > -1) {
            this.age = age;
        } else {
            throw new NegativeAgeException("ошибка! возраст не может быть отрицательным");
        }

    }
    public String getName() {
        return name;
    }
    public void setLocation(Place location) {
        this.location = location;
    }

    public Place getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return location.equals(human.location) &&
                name.equals(human.name);
    }

    @Override
    public String toString() {
        return "Человек создан";
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, name);
    }
}
