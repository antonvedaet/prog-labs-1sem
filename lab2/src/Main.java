import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Oranguru("Oranguru", 1);
        Pokemon p2 = new Cacnea("Cacnea", 1);
        Pokemon p3 = new Cacturne("Cacturne", 1);
        Pokemon p4 = new Bounsweet("Bounsweet", 1);
        Pokemon p5 = new Steenee("Steenee", 1);
        Pokemon p6 = new Tsareena("Tsareena", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
