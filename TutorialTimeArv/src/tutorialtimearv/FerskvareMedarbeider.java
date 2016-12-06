/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialtimearv;

/**
 *
 * @author Håkon
 */
public class FerskvareMedarbeider extends Person{
    String avdeling;

    public FerskvareMedarbeider(String avdeling, String navn, int alder, String kjønn) {
        super(navn, alder, kjønn);
        this.avdeling = avdeling;
    }
    
    
}
