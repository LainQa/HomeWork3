package guru.qa;

public class TeslaCars  {
    public static void main (String[] args){

        Electric modS = new Electric("S",30000,150);
        Electric mod5 = new Electric("5",15000,100);
        Electric mod3 = new Electric("3",13000,80);

        System.out.println("Welcome to Tesla`s showroom! We have:");
        System.out.println("");
        modS.saySpecs();
        System.out.println("");
        mod5.saySpecs();
        System.out.println("");
        mod3.saySpecs();
        System.out.println("");
        System.out.println("Today only, a special promotion on the Tesla 3  with an increased battery!");
        mod3.discount();
        mod3.saySpecs1();
    }
    //Added first commit
    //Added second commit

}
