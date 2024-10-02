package test.firstproject;

/**
 *
 * @author Sebastian
 */
public class SumaTotal1al20 {
    public static void main (String[] args){
        int suma =1;
        int i=0;
        
        do {
            suma+=i;
            i++;
    } while (i <= 20);
        System.out.println("El total de la suma es: " +suma);
    }
}
