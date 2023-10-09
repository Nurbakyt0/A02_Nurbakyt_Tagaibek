class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 3.5; // Adjust the cost as needed
    }
}
