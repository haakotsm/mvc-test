package tutorial_object;

public class Boks {
    private double vekt;
    private int volum;
    private String farge;

    public Boks() {
        vekt = 2.0;
        volum = 3;
        farge = "beige";
    }

    public Boks(double vekt, int volum) {
        this(vekt, volum, "beige");
    }

    public Boks(double vekt, int volum, String farge) {
        this.vekt = vekt;
        this.volum = volum;
        this.farge = farge;
    }

    public double getVekt() {
        return vekt;
    }

    public int getVolum() {
        return volum;
    }

    public String getFarge() {
        return farge;
    }

    public void setVekt(double vekt) {
        if (vekt > 0) {
            this.vekt = vekt;
        }
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public boolean equals(Boks otherBoks) {
        if (this.vekt != otherBoks.vekt) {
            return false;
        } else if (this.volum != otherBoks.volum) {
            return false;
        } else {
            return this.farge.equals(otherBoks.farge);
        }
    }
    
    @Override
    public String toString(){
        
        return vekt + " kg tung boks, med " 
                + volum + " m^3 volum. Den er fargen " + farge;
    }
}
