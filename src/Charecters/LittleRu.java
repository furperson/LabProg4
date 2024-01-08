package Charecters;

import AbstractClases.BasicAnimal;
import AbstractClases.BasicFriend;
import EnumS.ThingsEn;
import Interf.EatAble;
import Interf.TalkAble;

public class LittleRu extends BasicAnimal implements EatAble, TalkAble {
    private Boolean gotovEatJir;

    public Boolean getGotovEatJir() {
        return gotovEatJir;
    }

    public void setGotovEatJir(Boolean gotovEatJir) {
        this.gotovEatJir = gotovEatJir;
    }

    public LittleRu(String name) {
        super(name);
        gotovEatJir = false;
    }

    @Override
    public void eat(ThingsEn thn) {
        if(gotovEatJir){
            System.out.println(this.getName()+" съел рыбий жир");
        }
        else {
            System.out.println(this.getName()+" не готов есть рыбий жир");
        }
    }


    @Override
    public void talk() {
        System.out.println(this.getName()+" говорит :\"Может, не надо?\"");
    }

    @Override
    public String toString() {
        return "LittleRU{" +
                "name='" + this.getName() + '\'' +
                "gotovEatJir='" + this.getGotovEatJir() + '\'' +
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
