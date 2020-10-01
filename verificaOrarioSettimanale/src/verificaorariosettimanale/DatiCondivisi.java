/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaorariosettimanale;

import java.util.ArrayList;


/**
 *
 * @author delogu_gabriele_enea
 */
public class DatiCondivisi {

   ArrayList<JOrario> elencoClassiTrovate = new ArrayList<JOrario>(); //composto da ora professore, giorno e ora
   private int numEl;
   private String elncoCorse;//composto da un elenco di oggetti composto da Fermate e orari


   private String classeDaRicercare;

   public Semaphore sem1;
 
   //mututa esclusione: elencoClassiTrovate
    
   public  DatiCondivisi() {
       this.sem1 = new Semaphore(0);
       classeDaRicercare="";
      
   }
   
    public String getElncoCorse() {
        return elncoCorse;
    }

    public String getClasseDaRicercare() {
        return classeDaRicercare;
    }

    public void setElncoCorse(String elncoCorse) {
        this.elncoCorse = elncoCorse;
    }

    public void setClasseDaRicercare(String classeDaRicercare) {
        this.classeDaRicercare = classeDaRicercare;
    }
      public void SignalSem1() {
        sem1.Signal();
    }
          public void WaitSem1() {
        sem1.Wait();
    }
          public void pushVet(JOrario p){
              elencoClassiTrovate.add(p);
          }
    
   public void visualizzaOrari(){
            
            int lunghezzaVettore = elencoClassiTrovate.length;
            for (int i = 0; i < lunghezzaVettore; i++) {
           
            System.out.print(elencoClassiTrovate[i]+" "); 
           
            
        }
            

     
   }

     

    
            
}

