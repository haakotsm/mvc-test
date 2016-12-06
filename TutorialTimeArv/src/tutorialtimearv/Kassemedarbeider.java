package tutorialtimearv;

import java.util.Arrays;

public class Kassemedarbeider extends Ansatt {
    private boolean shiftarbeid;
    private String[] arbeidsoppgaver;
    
    public Kassemedarbeider(String navn, int alder, String kjønn,
            double lønn, String bedrift, boolean shiftarbeid, 
            String... arbeidsoppgaver){
        super(navn,alder,kjønn,lønn,bedrift);
        this.shiftarbeid = shiftarbeid;
        this.arbeidsoppgaver = arbeidsoppgaver;
    }
    
    public void printArbeidsOppgaver(){
        System.out.println(Arrays.toString(arbeidsoppgaver));
    }
}
