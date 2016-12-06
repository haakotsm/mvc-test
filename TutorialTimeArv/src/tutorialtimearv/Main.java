package tutorialtimearv;

public class Main {

    public static void main(String[] args) {
        Person p = new Ansatt("Kåre", 49, "Mann", 500000.00, "Nav");
        System.out.println(p.toString());
        p.spis("burger");
        Person k = new Kassemedarbeider("Kim", 23, "Mann", 40000.00, "Meny", true, "Vaske", "Selge", "Smile");
        Person f = new FerskvareMedarbeider("Fisk", "Håkon", 25, "Mann");
        //k.printArbeidsOppgaver();
        if (f instanceof Ansatt) {
            System.out.println(((Ansatt) f).getBedrift());
        }
        doWork(p); doWork(k); doWork(f);
    }

    public static void doWork(Person k) {
        if (k instanceof FerskvareMedarbeider) {
            System.out.println(((FerskvareMedarbeider) k).avdeling);
        } else if (k instanceof Kassemedarbeider) {
            ((Kassemedarbeider) k).printArbeidsOppgaver();
        } else if (k instanceof Ansatt) {
            System.out.println(((Ansatt) k).getBedrift());
        }
    }
}
