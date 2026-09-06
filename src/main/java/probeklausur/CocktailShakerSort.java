package probeklausur;

import java.util.Arrays;

// 1. Korrektur: Klassenname fängt mit Großbuchstaben an
public class CocktailShakerSort {

	public static int[] cocktailShakerSort(int[] array) {
		boolean swapped = true;
		int start = 0;
		int end = array.length - 1;
        
		while (swapped) {
			swapped = false;
            
			// Vorwärts
			for (int i = start; i < end; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
            
		    end--;
		
            // Wenn nichts getauscht wurde, ist das Array sortiert
            if (!swapped) {
                break;
            }
            
            swapped = false;
            
            // Rückwärts
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            
            start++;
		}
		
		return array;
	}
	
    public static void main(String[] args) {
        // 3. Korrektur: Unsortiertes Array als Testdaten verwenden
        int[] array = {6, 4, 1, 11};        

        System.out.println("Unsortiertes Array: 	" + Arrays.toString(array));

        int[] sortedArray = cocktailShakerSort(array);

        System.out.println("Sortiertes Array: 	" + Arrays.toString(sortedArray));
    }
}