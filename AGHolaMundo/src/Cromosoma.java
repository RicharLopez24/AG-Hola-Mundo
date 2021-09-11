
import java.util.Random;


//import static java.lang.Math.random;

/**
 *
 * @author ricardo
 */
public class Cromosoma {
    private String frase;
    private int generacion;
    private int tamFrase;
    public String alfabeto;
    public String fraseUA;
    private Random index;
    private String fraseDes;
 
    public Cromosoma() {
        index = new Random();
    }

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getFraseDes() {
        return fraseDes;
    }

    public void setFraseDes(String fraseDes) {
        this.fraseDes = fraseDes;
    }   

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public int getTamFrase() {
        return tamFrase;
    }

    public void setTamFrase(int tamFrase) {
        this.tamFrase = tamFrase;
    }
    
    public void init(){
        //System.out.println("tamanio alafeto"+alfabeto);
        fraseDes="";
        int ran;
        for (int i = 0; i < tamFrase; i++) {
            ran = index.nextInt(alfabeto.length()-1);
           // System.out.println("ind "+ran);
            fraseDes+= alfabeto.charAt(ran);
        }
      //  System.out.println("frase destino "+fraseDes.length());
      // System.out.println("frase destino "+fraseDes);
             
    }
    
    public String toString(){
        return fraseDes;
    }
    
}
