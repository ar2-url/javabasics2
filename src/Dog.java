public class Dog {

    private int size;     //todo dodaj name (pole, get set ) napisz metode toString

    public Dog(int size) {
        this.size = size;     // konstruktor bo kazdy pies musi miec rozmiar

    }

    public int getSize() {
        return size;                // bez setera bo nie zmianiamy rozmiaru psa w trakcie
    }
}
