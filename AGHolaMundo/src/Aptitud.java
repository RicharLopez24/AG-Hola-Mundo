/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class Aptitud {
    
    public int fitness(Cromosoma a, String frase){
        int aptitud=0;
        
      
        
        //System.out.println("cadena "+a.getFraseDes().indexOf(frase.charAt(0))  );
        for (int i = 0; i < frase.length(); i++) {
            if(a.getFraseDes().charAt(i) == frase.charAt(i)){
                aptitud+=1;
            }
            if(frase.indexOf(a.getFraseDes().charAt(i)) != -1){
                aptitud+=1;
            }
            /*if( a.getFraseDes().indexOf(frase.charAt(i)) != -1 ){
                aptitud += 1;
            }*/
            
        }
        
        
        return aptitud;
    }
       
}
