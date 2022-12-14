import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Person ponchik = new Person("Пончик");
        Cash bPonchik = new Balance(50, ponchik);
        System.out.println(ponchik.toString());

        Person piskarik = new Person("Пискарик", true);
        Cash bPiskarik = new Balance(50, piskarik);
        System.out.println(piskarik.toString());
        // пончик говорит, работает и вертиться на колесе
        ponchik.talk(piskarik);
        ponchik.work(piskarik);
        try {
            System.out.println(ponchik.recreation(RecreationWays.SPIN_ON_A_WHEEL, bPonchik));
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }

        Person leshik = new Person("Лещик", true);
        Cash bLeshik = new Balance(50, leshik);
        System.out.println(leshik.toString());

        Person somik = new Person("Сомик", true);
        Cash bSomik = new Balance(50, somik);
        System.out.println(somik.toString());

        Person sudak = new Person("Судачек", true);
        Cash bSudak = new Balance(50, sudak);
        System.out.println(sudak.toString());

        // знакомство с обществом

        ponchik.talk(new Crowd("Обществом свободных крутильщиков"));

        ponchik.setMembership(true);
        System.out.println("Пончик вступил в Общество свободных крутильщиков");

        System.out.println(ponchik.toString());

        // развлечения лунатиков
        Hashtable<Person, Cash> map = new Hashtable<Person, Cash>();
        map.put(piskarik, bPiskarik);
        map.put(leshik, bLeshik);
        map.put(somik, bSomik);
        map.put(sudak, bSudak);
        map.put(ponchik, bPonchik);
        for (RecreationWays r : RecreationWays.values()) {
            Enumeration<Person> e = map.keys();
            while (e.hasMoreElements()) {
                if (r.getName() != "вертеться на колесе") {
                    Person key = e.nextElement();
                    try {
                        System.out.println(key.recreation(r, map.get(key)));
                    } catch (Throwable ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    break;
                }
            }
        }
        Crowd workers = new Crowd("работяги ");
        workers.fight();
        Newspaper n = new Newspaper();
        n.tell();
    }
}