import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cacnea extends Pokemon {
    public Cacnea(String name, int level){
        super(name, level);
        setStats(50, 85, 40, 85, 40, 35);
        setType(Type.GRASS);
        setMove(new RestCacnea(), new Swagger(), new DoubleTeam());
    }
    
}