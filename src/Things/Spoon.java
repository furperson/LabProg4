package Things;

import AbstractClases.BasicDrink;
import Exceptions.Checked.EmptySpoonException;

public class Spoon {

    private BasicDrink bd;
    public Spoon(BasicDrink smn){
        this.bd= smn;
    }

    public void eatFromSpoon() throws EmptySpoonException {
        if(this.bd!=null){
            bd.toBeEaten();
            bd=null;
        }
        else {
            throw new EmptySpoonException();
        }
    }

}
