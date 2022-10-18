import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Pokemon{
    public Steenee(String name, int level){
        super(name, level);
        setStats(52, 40, 48, 40, 48, 62);
        setType(Type.GRASS);
        setMove(new EnergyBall(), new Confide(), new PlayNice());
    }
}
