package tutorialtimearv;

public class Ansatt extends Person implements Printinfo{
    private double lønn;
    private String bedrift;
    
    public Ansatt(String navn, int alder, String kjønn, 
            double lønn, String bedrift){
        super(navn,alder,kjønn);
        this.lønn = lønn;
        this.bedrift = bedrift;
    }

    public double getLønn() {
        return lønn;
    }

    public void setLønn(double lønn) {
        this.lønn = lønn;
    }

    public String getBedrift() {
        return bedrift;
    }

    public void setBedrift(String bedrift) {
        this.bedrift = bedrift;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " "+ lønn + " " + bedrift;
    }

    @Override
    public void printinfo() {
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
}
