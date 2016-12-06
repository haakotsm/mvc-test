package tutorialabstract;

public class Dataingeniør extends Person {
    public String felt;
    public String utdanning;

    public Dataingeniør(String felt, String utdanning, String navn, int alder) {
        super(navn, alder);
        this.felt = felt;
        this.utdanning = utdanning;
    }

    @Override
    public void speak() {
        System.out.println("Jeg har " + utdanning + "!!!");
    }

    @Override
    public boolean employed() {
        return true;
    }
    @Override
    public String toString(){
        return super.toString()+
                "Felt: " + felt + "\n"+
                "Utdanning: " + utdanning + "\n"; 
    }
    
}
