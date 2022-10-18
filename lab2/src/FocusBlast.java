import ru.ifmo.se.pokemon.*;


public class FocusBlast extends SpecialMove{
    public FocusBlast(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.10){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использует Focus Blast";
    }
}
