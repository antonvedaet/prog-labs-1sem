public class Person implements ISociety, IAction {
    private String name;
    private Boolean membership = false;

    Person(String name) {
        this.name = name;
    }

    Person(String name, Boolean membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public Boolean isMember() {
        return membership;
    }

    public String recreation(RecreationWays w, Cash b) throws Throwable {
        Throwable t = new NotEnoughException("У " + name + " не хватает денег на " + w.getName());
        if (b.getCash() < w.getСost())
            throw t;
        return name + " решил " + w.getName();
    }

    public void talk(Person p) {
        System.out.println(name + " разговаривает с " + p.getName());
    }

    public void work(Person p) {
        class Pelvis {
            String name = " лоханке ";

            @Override
            public String toString() {
                return name;
            }
        }
        Pelvis a = new Pelvis();
        if (p.getName() == name) {
            throw new DoppelgangerError("Лунатики не могут работать сами с собой");
        } else {
            System.out.println(p.getName() + " работает с " + name + " на " + a.toString());
        }

    }

    @Override
    public String toString() {
        return ("Name: " + name + "\n" +
                "Membership: " + membership);
    }
}
