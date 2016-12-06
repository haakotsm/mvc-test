package tutorialtimearv;

public abstract class Person {
    protected String navn;
    protected int alder;
    protected String kjønn;

    public Person(String navn, int alder, String kjønn) {
        this.navn = navn;
        this.alder = alder;
        this.kjønn = kjønn;
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

    public String getKjønn() {
        return kjønn;
    }

    public void setKjønn(String kjønn) {
        this.kjønn = kjønn;
    }
    
    public void spis(String mat){
        System.out.println(navn + " spiser " + mat);
    }
    
    @Override
    public String toString(){
        return navn + " " + alder + " " + kjønn;
    }
}
