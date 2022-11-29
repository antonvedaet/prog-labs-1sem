public class Balance extends Cash{
    String holder;
    int amount;
    Balance(int amount, Person p){
        super(amount);
        holder = p.getName();
    }
    public String checkHolder(){
        return holder;
    }
    @Override
    public String toString() {
        return "Владелец счета: " + holder + "\n" + "Кол-во денег на счете: " + amount;
    }

}
