package Charecters;

import AbstractClases.BasicAnimal;
import AbstractClases.BasicFriend;
import EnumS.ThingsEn;

public class Pyatochok extends BasicFriend {
    public Pyatochok(String name) {
        super(name);
    }

    @Override
    public void ugovarivat(LittleRu ltlru) {
        System.out.println(this.getName()+" уговаривает "+ltlru.getName() + " сьесть "+ ThingsEn.РЫБИЙ_ЖИР.toString());
        ltlru.setGotovEatJir(true);
    }

    @Override
    public void stayAround(BasicAnimal anm) {
        System.out.println(this.getName()+" стоит вокруг "+anm.getName());
    }
    @Override
    public String toString() {
        return "Pyatochok{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return this.toString()==o.toString();
    }
}


