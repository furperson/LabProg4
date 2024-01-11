package Things;

import EnumS.ThingsEn;

import java.util.Random;

public class Jar {
    public Jar(){
        super();
    }
    final static Random random = new Random();

   public static class ThingsFromJar{
        public ThingsEn takeSomeone(){
            ThingsEn[] thng=ThingsEn.values();
            ThingsEn finded = thng[random.nextInt(thng.length)];
            System.out.println("Из банки достали: "+finded.toString());
            return finded;

        };
    };
}
