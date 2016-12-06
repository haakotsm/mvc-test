package tutorialabstract;

public abstract class Person {
    public String navn;
    public int alder;
    
    public abstract void speak();
    public abstract boolean employed();
    
    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

@Override
public String toString(){
    return "Navn: " + navn + "\n" 
            + "Alder: " + alder + "\n";
    
}
    
}
