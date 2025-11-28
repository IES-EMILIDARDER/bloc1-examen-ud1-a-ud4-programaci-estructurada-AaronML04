package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    
   
    //Convierte un array de enteros en un ArrayList<Integer>.
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : array) {
            arrayList.add(a);
        }

        return arrayList;
    }

    //Genera un array de enteros con una longitud dada y números aleatorios
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }

    //Muestra por pantalla un array de enteros con formato [a, b, c]. 
    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');
    }

    //Obtiene los valores repetidos entre dos arrays
    public static ArrayList<Integer> obteRepetits(int[] arr1, int[] arr2){
        ArrayList<Integer> repes = new ArrayList<>();

        for (int valor1 : arr1) {
            for (int valor2 : arr2) {
                if (valor1 == valor2) {
                    if (!repes.contains(valor1)) { 
                        repes.add(valor1);
                    }
                }
            }
        }
        return repes;
    }

    //Ordena un array de enteros
    public static ArrayList<Integer> ordenaArray(int[] array){
        ArrayList<Integer> ordena = new ArrayList<>();

        for (int valor : array) {

            boolean inserit = false;

            for (int i = 0; i < ordena.size(); i++) {
                if (valor < ordena.get(i)) {
                    ordena.add(i, valor);
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

    //Devuelve los valores repetidos entre dos arrays y los ordena. 
    public static ArrayList<Integer> obteRepetitsOrdenats(int[] arr1, int[] arr2){
        ArrayList<Integer> resultat;
        int[] hola ;

        resultat = UtilExamen.obteRepetits(arr1, arr2);

        hola = UtilExamen.ArrayListToArray(resultat);

        resultat = UtilExamen.ordenaArray(hola);

        return resultat; 
    }


    // Muestra por pantalla un ArrayList<Integer> en formato [ a b c ]. 
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    } 


    //Convierte un ArrayList<Integer> en un array de int. 
    public static int[] ArrayListToArray(ArrayList<Integer> arrayL) {
        int[] resultat = new int[arrayL.size()];

        for (int i = 0; i < arrayL.size(); i++) {
            resultat[i] = arrayL.get(i);
        }

        return resultat;
    }

}
