package AbstractClases;

import Charecters.LittleRu;

import java.util.Objects;

abstract public class BasicFriend {
    abstract public void ugovarivat(LittleRu ltlru);
    abstract public void stayAround(BasicAnimal anm);

    public BasicFriend(String name){
        this.name=name;
    };

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BasicFriend{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicFriend that = (BasicFriend) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
