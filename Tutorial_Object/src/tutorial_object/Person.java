package tutorial_object;


public class Person {

    private String fornavn;
    private String etternavn;
    private String kjønn;
    private Boks boks;
    
    public Person(){
        fornavn = "";
        etternavn = "";
        kjønn = "";
    }
    public Person(String fornavn, String etternavn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjønn = "";
        boks = new Boks();
    }
    public Person(String fornavn, String etternavn,
            String kjønn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjønn = kjønn;
        boks = new Boks();
    }
    
    public Person(String fornavn, String etternavn, String kjønn, Boks boks){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjønn = kjønn;
        this.boks = boks;
    }
    
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }
   
    public String getFornavn(){
        return this.fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        if(!etternavn.equals("spaghetti")){
        this.etternavn = etternavn;
        }
        else {
            System.out.println("Spaghetti er ikke et gyldig etternavn");
        }
    }

    public String getKjønn() {
        return kjønn;
    }

    public void setKjønn(String kjønn) {
        if(kjønn.equals("Mann") || kjønn.equals("Kvinne") || kjønn.equals("Annet")){
        this.kjønn = kjønn;
        } else {
            System.out.println(kjønn + " er ikke et gyldig kjønn");
        }
    }

    public Boks getBoks() {
        return boks;
    }

    public void setBoks(Object boks) {
        this.boks = (Boks) boks;
    }
    
    public int compareTo(Person other){
        int i;
        i = this.kjønn.compareTo(other.kjønn) +
                this.fornavn.compareTo(other.fornavn)
                + this.etternavn.compareTo(other.etternavn);
        return i;
    }

    @Override
    public String toString() {
        return fornavn + " " + etternavn + 
                " er en " + kjønn + " og har en " + boks.toString();
    }
    
    
    
    
    
}
