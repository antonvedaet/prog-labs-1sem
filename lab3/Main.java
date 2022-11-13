public class Main{
    public static void main(String[] args) {
        Person piskarik = new Person("Пискарик");
        Balance bPiskarik = new Balance(50, piskarik);
        System.out.println(piskarik.toString());

        Person leshik = new Person("Лещик", true);
        Balance bLeshik = new Balance(50, leshik);
        System.out.println(leshik.toString());

        Person somik = new Person("Сомик", true);
        Balance bSomik = new Balance(50, somik);
        System.out.println(somik.toString());

        Person sudak = new Person("Судачек", true);
        Balance bSudak = new Balance(50, sudak);
        System.out.println(sudak.toString());

        piskarik.setMembership(true);
        System.out.println("Пискарик вступил в Общество свободных крутильщиков");

        System.out.println(piskarik.toString());

        System.out.println(piskarik.Recreation(RecreationWays.SMALLTALK, bPiskarik));
        System.out.println(leshik.Recreation(RecreationWays.SMALLTALK, bLeshik));
        System.out.println(somik.Recreation(RecreationWays.SMALLTALK, bSomik));
        System.out.println(sudak.Recreation(RecreationWays.SMALLTALK, bSudak));

        System.out.println(piskarik.Recreation(RecreationWays.BOOK, bPiskarik));
        System.out.println(leshik.Recreation(RecreationWays.BOOK, bLeshik));
        System.out.println(somik.Recreation(RecreationWays.BOOK, bSomik));
        System.out.println(sudak.Recreation(RecreationWays.BOOK, bSudak));

        System.out.println(piskarik.Recreation(RecreationWays.NEWSPAPER, bPiskarik));
        System.out.println(leshik.Recreation(RecreationWays.NEWSPAPER, bLeshik));
        System.out.println(somik.Recreation(RecreationWays.NEWSPAPER, bSomik));
        System.out.println(sudak.Recreation(RecreationWays.NEWSPAPER, bSudak));

        System.out.println(piskarik.Recreation(RecreationWays.TELEVISION, bPiskarik));
        System.out.println(leshik.Recreation(RecreationWays.TELEVISION, bLeshik));
        System.out.println(somik.Recreation(RecreationWays.TELEVISION, bSomik));
        System.out.println(sudak.Recreation(RecreationWays.TELEVISION, bSudak));
    }
}