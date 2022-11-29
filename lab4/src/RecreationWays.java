public enum RecreationWays {
    SMALLTALK("разговаривать"),
    NEWSPAPER("читать Газету",5),
    BOOK("читать книгу", 20),
    TELEVISION("смотреть телевизор", 100),
    SPIN_ON_A_WHEEL("вертеться на колесе", 50);
    

    private String name;
    private int cost;

    RecreationWays(String name){
        this.name = name;
        this.cost = 0;
    }
    RecreationWays(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public int getСost(){
        return cost;
    }
}
