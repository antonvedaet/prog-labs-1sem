public enum RecreationWays {
    BOOK("читать книгу", 20),
    TELEVISION("смотреть телевизор", 100),
    NEWSPAPER("читать Газету",5),
    SMALLTALK("разговаривать", 0);

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
