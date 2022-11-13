public class Person implements ISociety, IAction{
    private String name;
    private Boolean membership = false;

    Person(String name){
        this.name = name;
    }

    Person(String name, Boolean membership){
        this.name = name;
        this.membership = membership;
    }
    public String getName(){
        return name;
    } 

    public void setMembership(Boolean membership){
        this.membership = membership;
    } 

    public Boolean isMember(){
        return membership;
    }

    public String Recreation(RecreationWays w, Balance b){
        if(b.getCash() >= w.getСost()){
            return name + " решил " + w.getName();
        }
        return name + " не хватает денег на " + w.getName();
        
    }

    @Override
    public String toString(){
        return ("Name: " + name + "\n" + 
        "Membership: " + membership);
    }
}
