package Charecters;

import AbstractClases.BasicAnimal;
import AbstractClases.BasicFriend;
import EnumS.PartsOfTigerEn;
import EnumS.ThingsEn;
import Interf.*;

import java.util.Random;

public class Tigra extends BasicAnimal implements EatAble , SuvatAble, EvalAble, FindAble, AskAble {
    final Random random = new Random();
    public Tigra(String name){
        super(name);
    };


    @Override
    public Boolean evaluate(ThingsEn thn) {
        if(thn == ThingsEn.ЯБЛОКО){
            System.out.println(this.getName()+" может сьесть "+thn.toString());
            return true;
        }
        else{
            System.out.println(this.getName()+" не может сьесть "+thn.toString());
            return false;
        }

    }

    @Override
    public ThingsEn find() {
        ThingsEn[] thng=ThingsEn.values();
        ThingsEn finded = thng[random.nextInt(thng.length)];
        System.out.println(this.getName()+" нашёл "+finded.toString());
        return finded;
    }

    @Override
    public void suvat(PartsOfTigerEn prt) {
        System.out.println(this.getName()+" сунул "+prt.toString() + " в банку");
    }

    @Override
    public void eat(ThingsEn thn) {
        if(this.evaluate(thn)){
        System.out.println(this.getName()+" съел "+thn.toString());}

    }

    @Override
    public void ask(BasicFriend friend) {
        System.out.println(this.getName()+" спросил "+ friend.getName());
    }

    @Override
    public String toString() {
        return "Tigra{" +
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
