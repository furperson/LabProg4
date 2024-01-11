package AbstractClases;

import Interf.Edible;

abstract public class BasicDrink implements Edible {
    private boolean isExist;

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public BasicDrink(){
        this.isExist = true;
    }

}
