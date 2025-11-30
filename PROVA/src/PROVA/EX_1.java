package PROVA;

import PROVA.UtilExamen;
import java.util.ArrayList;


public class EX_1 {
    public static void main(String[] args) {
        int[] array;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> arrayL = new ArrayList<>();  // 'arraylist' resultant  // CORRECCIÓ: te sobra aquest 'new'
        
        // Crea un 'Array' de 5 posicions amb números aleatoris entre 0 i 9
        array = UtilExamen.generaArray(5, 0, 9);
        
        
        // Calcula l''ArrayList' emprant el mètode 'arrayToArrayList' 
        arrayL = UtilExamen.arrayToArrayListInt(array);
        
        
        // Mostra l''ArrayList' resultat emprant el mètode 'mostraArrayListInt' 
        UtilExamen.mostrarArrayListInt(arrayL);
                
                
    }
}

