public class Citizen {

    private String name;
    private int moneyAmount;
    private Dog dog;

    public Citizen(String name, int moneyAmount) {
        this.name = name;
        this.moneyAmount = moneyAmount;     // psa nie ma bo moze miec psa lub nie nabyc go
    }

    public String getName() {
        return name;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
