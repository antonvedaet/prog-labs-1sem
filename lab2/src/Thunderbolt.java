import ru.ifmo.se.pokemon.*;


public class Thunderbolt extends SpecialMove{
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.10){
            Effect effect = (new Effect()).condition(Status.PARALYZE);
            p.setCondition(effect);
        }
    }
    @Override
    protected String describe() {
        return "использует Thunderbolt";
    }
}
