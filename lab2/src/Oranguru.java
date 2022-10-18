import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oranguru extends Pokemon {
    public Oranguru(String name, int level){
        super(name, level);
        setStats(90, 60, 80, 90, 110, 60);
        setType(Type.NORMAL, Type.PSYCHIC);
        setMove(new Thunderbolt(), new WorkUp(), new FeintAttack(), new Confide());
    }
    
}
