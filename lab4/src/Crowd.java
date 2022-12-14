public class Crowd extends Person {
    public String name;

    public Crowd(String name) {
        super(name);
    }

    public void fight() {
        Person scooperfield = new Person("Скуперфильд");
        System.out.println(name + " борются со " + scooperfield.getName());
    }

}
