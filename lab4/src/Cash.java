abstract class Cash {
    private int amount;

    Cash(int amount) {
        this.amount = amount;
    }

    public void setCash(int amount) {
        this.amount = amount;
    }

    public int getCash() {
        return amount;
    }

}
