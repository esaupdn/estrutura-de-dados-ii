package javasort;

import java.util.ArrayList;

public class Search {

    static int compLinear = 0, compBinaria = 0;

    public static int linearSearchArtistName(ArrayList<Dados> listener, String search) {
        int comparsons = 0;
        for (Dados d : listener) {
            comparsons++;
            if (d.getArtistName().equals(search)) 
                return comparsons;
        }
        return -1;
    }


    
    public static boolean linearSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            compLinear++;
            if (x == array[i]) {
                return true;
            }
        }
        return false;
    }
    //-------------------

    public static boolean binarySearch(int array[], int x) {
        int ini, fim, meio;
        ini = 0;
        fim = array.length - 1;
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            compBinaria++;
            if (x == array[meio]) {
                return true;
            } else if (x > array[meio]) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
    }

    //-------------------
}
