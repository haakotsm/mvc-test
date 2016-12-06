package tutorialabstract;

public class Kassemedarbeider extends Person {

    public String arbeidsplass;
    public String ansiennitet;
    public double lønn;

    public Kassemedarbeider(String arbeidsplass, String ansiennitet,
            double lønn, String navn, int alder) {
        super(navn, alder);
        this.arbeidsplass = arbeidsplass;
        this.ansiennitet = ansiennitet;
        this.lønn = lønn;
    }

    @Override
    public void speak() {
        System.out.println("Det blir 20 kr takk");
    }

    @Override
    public boolean employed() {
        return !arbeidsplass.equals("");
    }

}
