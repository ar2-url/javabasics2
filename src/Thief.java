public class Thief {

    private String name;
    private int stolenMoneyAmount;

    public Thief(String name) {
        this.name = name;

    }

    public String getName() {     //imie sie nie zmienia
        return name;
    }

    public int getStolenMoneyAmount() {
        return stolenMoneyAmount;
    }

    public void setStolenMoneyAmount(int stolenMoneyAmount) {
        this.stolenMoneyAmount = stolenMoneyAmount;
    }

    public void steal(Citizen citizen) {
        System.out.println("ja " + name /*tutaj komentarz*/+ " sprobuje okrasc mieszkanca: " + citizen.getName());   //tutaj getName nie trzeba bo jestesmy w klasie Thief
        if(citizen.getDog() != null)                  // uwaga na NUll Pointer exception
        {    if(citizen.getDog().getSize() > 50) {
            System.out.println("Nie tym razem :(");
        }  else {
            System.out.println("Pies cos tam szczeka ale udalo sie skubnac");
            stolenMoneyAmount = stolenMoneyAmount + 100;                       // stolenMonAmount +=100
            citizen.setMoneyAmount(citizen.getMoneyAmount() - 100);
        }
            //todo
        }   else {
            System.out.println("Haha dzisiaj prosta robota :)");
            stolenMoneyAmount = stolenMoneyAmount + citizen.getMoneyAmount();
            // stolenMonAmount += citizen.getMoneyAmount
            citizen.setMoneyAmount(0);


        }
        }
    }


