package Charecters;

import AbstractClases.BasicAnimal;
import Exceptions.UnChecked.Excep;
import Interf.WriteAble;

public class Bunny extends BasicAnimal implements WriteAble {
    public Bunny(String name) {
        super(name);
    }

    @Override
    public void write(String mess) throws Excep {
        if(mess.length()!=0){
        Mail mail  = new Mail(mess);
        mail.makeMail();}
        else {
            throw new Excep();
        }
    }

    class Mail{
        private String mess;
        public Mail(String message){
            this.mess = message;

        }

        public void makeMail(){
            System.out.println("Написано письмо: "+mess+" Подпись: "+Bunny.this.getName());
        }

    };
}
