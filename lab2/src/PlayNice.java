import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove{
    public PlayNice(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected String describe(){
        return "использует Play Nice";
    }
}
