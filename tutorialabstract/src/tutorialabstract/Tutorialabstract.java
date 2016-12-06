package tutorialabstract;

public class Tutorialabstract {

    public static void main(String[] args) {
    Kassemedarbeider k = new Kassemedarbeider("", "10år", 1000, "Håkon", 25);
        System.out.println(k.employed());
        k.speak();
        Dataingeniør d = new Dataingeniør("Frontend", "PhD", "Henrik", 28);
        d.speak();
        Dataingeniør r = d;
        makeThemSpeak(d,k);
        System.out.println(d.toString().equals(r.toString()));
        System.out.println(d.toString());
    }
    
    public static void makeThemSpeak(Person... p){
        for(Person t : p){
            t.speak();
        }
    }
    
}
