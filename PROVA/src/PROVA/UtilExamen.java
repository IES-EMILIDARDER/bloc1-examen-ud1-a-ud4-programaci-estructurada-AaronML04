package PROVA;

import java.util.ArrayList;

public class UtilExamen {

    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }
    
    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');

    }
    
    public static ArrayList<Integer> obteRepetits(int[] arr1, int[] arr2){
        ArrayList<Integer> repes = new ArrayList<>();
        
    
        for (int valor1 : arr1) {
            for (int valor2 : arr2) {
                if (valor1 == valor2) {
                    if (!repes.contains(valor1)) { // Evitar duplicats  // CORRECCIÓ: no es pot emprar 'contains' i a més aquí no cal
                        repes.add(valor1);
                        break;  // CORRECCIÓ: necesitas el break para no repetir elementos
                    }
                }
            }
        }
        return repes;
    }
    
    public static ArrayList<Integer> ordenaArray(int[] array){
        ArrayList<Integer> ordena = new ArrayList<>();
        
        for (int valor : array) {

            boolean inserit = false;

            
            for (int i = 0; i < ordena.size(); i++) {
                if (valor < ordena.get(i)) {
                    ordena.add(i, valor);   // Inserció ordenada
                    inserit = true;
                    break;
                }
            }

            
            if (!inserit) {
                ordena.add(valor);
            }
        }
        return ordena;
    } 
    
    public static ArrayList<Integer> obteRepetitsOrdenats(int[] arr1, int[] arr2){
        ArrayList<Integer> resultat;
        int[] hola ;

        
        resultat = UtilExamen.obteRepetits(arr1, arr2);
        
        hola = UtilExamen.ArrayListToArray(resultat);  // CORRECCIÓ: en serio le vas a llamar a esta variable 'hola' ?
        
        UtilExamen.ordenaArray(hola);  // CORRECCIÓ: puedes hacerlo directamente
    
        return resultat;
    }
    
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
    public static int[] ArrayListToArray(ArrayList<Integer> arrayL) {
        int[] resultat = new int[arrayL.size()];
        
        for (int i = 0; i < arrayL.size(); i++) {
            resultat[i] = arrayL.get(i);
        }
        
        return resultat;
    }
}


