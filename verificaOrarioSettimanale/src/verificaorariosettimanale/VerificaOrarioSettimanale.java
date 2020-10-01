/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaorariosettimanale;
import java.util.Scanner;

/**
 *
 * @author Gabriele
 */

public class VerificaOrarioSettimanale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        DatiCondivisi datiCon = new DatiCondivisi();
         Scanner scanner =  new Scanner(System.in);

        
        System.out.print("Inserire la classe da ricercare: ");
       String classe= scanner.nextLine();
        System.out.println();
        
        datiCon.setClasseDaRicercare(classe);
        
        String riga1 ="ORA,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,tot ore";
        String riga2 ="AGOSTONI G.,2BI,2CI LFS,1AI LFS,.,.,.,2CI,1AI,1BI LFS,2AI,.,.,-,-,-,-,-,-,1BI,2BI LFS,1CI LFS,.,2AI,.,1CI,2CI,1AI,.,2AI LFS,.,1CI,1BI,2BI,.,.,18";
        String riga3 ="ALI' M.,3AL,4BS,.,4AL,5AS,.,5AL,5BL,.,4BL,3AS,.,-,-,-,-,-,-,4BS,3BS,3AL,4BL,.,.,.,.,4AL,3BS,4AS,.,3AS,5BL,5AL,5AS,4AS,20\n";
        String riga4 ="ALIPRANDI S.,4AM LI5,4AM LI5,4BE,.,3EE,.,.,.,5AM LSM,5AM LSM,3EE LSM,3EE LSM,-,-,-,-,-,-,.,.,.,4BE LSM,4BE LSM,4AM,4AM,5AM LSM,.,4BE,5BM LSM,.,.,.,5BM LSM,5BM LSM,3EE,18";
        String riga5 ="ANDREACCHI S.,5AI LI6,1CI LI4,4BI LI7,5BI LI7,.,.,3BI LI7,3BI LI7,5BI LI7,4CI LI7,4CI LI7,.,5AI LI6,5AI LI6,.,4BI LI7,4BI LI7,.,.,5BI LI7,5BI LI7,.,.,.,.,.,1CI LI4,3BI LI7,4CI LI7,.,-,-,-,-,-,18";
        String riga6 ="ASTA L.,-,-,-,-,-,-,.,.,.,4AM,2AM,2AM,3EE,3EE,.,4AM,2AM,.,2AM,4AM,4AM,.,.,.,3EE,3EE,2AM,4AM,.,.,4AM,3EE,3EE,.,2AM,18";
        String riga7 ="BALLABIO M.L.,5D,2B,1D,.,5AI,.,.,.,2B,5AI,2C,5D,.,.,1D,5D,2C,.,,,,,,,.,5AI,1D,2C,2B,.,-,-,-,-,-,15";
        String riga8 ="BARDI P.,.,.,1BM LI4,5AI LI6,1CM LI4,.,-,-,-,-,-,-,1AM LI4,.,1CM LI4,.,.,.,5AI LI6,5AI LI6,1BM LI4,.,1AM LI4,.,1AC LI2,1AC LI2,1BC LI2,1BC LI2,.,.,5AI LI6,5AI LI6,4AI LI6,4AI LI6,3AI LI6,18";
                
        String[] orari =riga1.split(",");
        String[] prof1 =riga2.split(",");
        String[] prof2 =riga3.split(",");
        String[] prof3 =riga4.split(",");
        String[] prof4 =riga5.split(",");
        String[] prof5 =riga6.split(",");
         String[] prof6 =riga7.split(",");
          String[] prof7 =riga8.split(",");
          
        
        threadRicerca th1 = new threadRicerca(datiCon,prof1);
        threadRicerca th2 = new threadRicerca(datiCon,prof2);
        threadRicerca th3 = new threadRicerca(datiCon,prof3);
        threadRicerca th4 = new threadRicerca(datiCon,prof4);
        threadRicerca th5 = new threadRicerca(datiCon,prof5);
         threadRicerca th6 = new threadRicerca(datiCon,prof6);
          threadRicerca th7 = new threadRicerca(datiCon,prof7);
        


        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        
        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();
        
        
    }
    
}