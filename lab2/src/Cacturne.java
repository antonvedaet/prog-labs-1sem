import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cacturne extends Pokemon {
    public Cacturne(String name, int level){
        super(name, level);
        setStats(70, 115, 60, 115, 60, 55);
        setType(Type.GRASS, Type.DARK);
        setMove(new RestCacturne(), new Swagger(), new DoubleTeam(), new FocusBlast());
    }
    
}