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
public class threadRicerca  extends Thread{
    
    private DatiCondivisi datiCon;
    private String[] vettore;
    private String professore;
  private String classe;
    
    public threadRicerca(DatiCondivisi datiCon,String[] n){
        this.datiCon = datiCon;
        this.vettore=n;
        classe=datiCon.getClasseDaRicercare();
    }
    
    @Override
    public void run(){
        professore=vettore[1];
        for(int i=1;i<vettore.length-1;i++)
        {
            if(vettore[i]==classe)
            {
                datiCon.WaitSem1();
                datiCon.pushVet(JOrario("",i,professore));
                datiCon.SignalSem1();        
            }
        }
        
        
       // datiCon.signalMutex1();
    }
    
}
