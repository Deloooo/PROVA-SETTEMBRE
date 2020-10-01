/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaorariosettimanale;

/**
 *
 * @author delogu_gabriele_enea
 */
public class JOrario {
    /**
 *
 * @author Gabriele
*/
    
    private String Giorno;
    private int orari;
    private String professore;
   
    JOrario(){
        Giorno="";
        orari=0;
        professore="";
    }

    public JOrario(String Giorno, int orari, String professore) {
        this.Giorno = Giorno;
        this.orari = orari;
        this.professore = professore;
    }
    

    
}


