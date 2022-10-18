import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove{
    public RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }

    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2){
        if(p1.getStat(Stat.SPEED) * 3 / 512 > Math.random()){
            return 2.0D;
        }
        return 1.0D;
    }
    @Override
    protected String describe(){
        return "использует Razor Leaf";
    }
}
