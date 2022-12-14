public class Newspaper {
    String name = "газеты ";

    private class Astronaut extends Person {
        String name = " космонавты ";

        Astronaut(String name) {
            super(name);
        }

        protected String news() {
            return (name + "прибыли на луну");
        }
    }

    public void tell() {
        Astronaut p = new Astronaut(" космонавты ");
        System.out.println(name + " объявили о том что " + p.news());
    }
}
