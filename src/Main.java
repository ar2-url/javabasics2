public class Main {
    public static void main(String[] args) {

        Dog smallDog = new Dog(25);
        Citizen citizenBoguslaw = new Citizen("Boguslaw", 1000);
        citizenBoguslaw.setDog(smallDog);                                               //pierwsza postac

        Dog bigDog = new Dog(75);
        Citizen citizenGienia = new Citizen("Gienia", 500);
        citizenGienia.setDog(bigDog);

        Citizen citizenStefan = new Citizen("Stefan", 750);

        Thief thief = new Thief("Obrotny Johny");

        printAccountBalance(thief);
        printAccountBalance(citizenBoguslaw);
        printAccountBalance(citizenGienia);
        printAccountBalance(citizenStefan);

        thief.steal(citizenBoguslaw);
        printAccountBalance(thief);             // dzieki temu ze wczesniej napisalismy printAccBalance thief i inne to mozemy tego uzyc
        printAccountBalance(citizenBoguslaw);

        thief.steal(citizenGienia);
        printAccountBalance(thief);
        printAccountBalance(citizenGienia);

        thief.steal(citizenStefan);
        printAccountBalance(thief);
        printAccountBalance(citizenStefan);

    }

    private static void printAccountBalance(Thief thief) {
        System.out.println("Konto zlodzieja: " + thief.getName() + " " + thief.getStolenMoneyAmount());  //metoda wyw

    }

    private static void printAccountBalance(Citizen citizen) {
        System.out.println("Konto mieszkanca: " + citizen.getName() + " " + citizen.getMoneyAmount());
    }
}
