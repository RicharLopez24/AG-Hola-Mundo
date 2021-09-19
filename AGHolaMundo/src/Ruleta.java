
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class Ruleta {
    
    public int SumaApt(ArrayList<Integer> aptitues){
        int suma =0;
        for (int i = 0; i < aptitues.size(); i++) {
            suma = suma + aptitues.get(i);
        }
        
        return suma;
    }
    
    public double SumaAptEs(ArrayList<Double> aptitues){
        double suma =0;
        for (int i = 0; i < aptitues.size(); i++) {
            suma = suma + aptitues.get(i);
        }
        
        return suma;
    }
    
    public Cromosoma Seleccion(double T,double ale,ArrayList<Double> valesp, double suma, ArrayList<Cromosoma> poblacion){
        Cromosoma selec = null;
        
        for (int i = 0; i < poblacion.size(); i++) {
            suma += valesp.get(i);
           // System.out.println("suma: "+suma);
            if(suma >= ale){
                selec = poblacion.get(i);
                break;
            }
        }
       
        return selec;
    }
}
