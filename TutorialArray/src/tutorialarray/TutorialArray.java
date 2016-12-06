package tutorialarray;

import java.util.Arrays;

public class TutorialArray {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] d = new int[10];
        System.out.println(Arrays.toString(a));
        int b = 20;
        System.out.println("Før prosedyren: " + a[0]);
        pekere(a, b);
        System.out.println("Etter prosedyre: " + a[0]);
        int[] c = a;
        pekere(c, 30);
        System.out.println("Etter c har endred verdi: " + a[0]);
        System.out.println(a == d);
        System.out.println(a == c);
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
    }

    public static void pekere(int[] b, int verdi) {
        b[0] = verdi;
        System.out.println("I prosedyren: " + b[0]);
    }

    /*  public static void leggInnAllePlasser(int verdi) {
        for (int i = 0; i < a.length; i++) {
            a[i] = verdi;
        }
    }

    public static void leggInn(int indeks, int verdi) {
        a[indeks] = verdi;
    }
     */
}
