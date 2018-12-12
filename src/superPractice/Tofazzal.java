package superPractice;

public class Tofazzal extends Daddy{
    public Tofazzal(){
        //super();
        super("Sharkar");

        System.out.println("deafult: Tofazzal");
    }
    public void color(){
        System.out.println("Bright color from daddy\n");
    }
    public void familyTree(){

        System.out.println("I got my family name as: "+familyName);
        super.eyeColor();
    }
}
