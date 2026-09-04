package probeklausur;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	
	public static int linearSearch(int[] array, int searched) {
		
		for(int i = 0; 0<array.length; i++) {
			
			if(array[i] == searched) {
				return i;
			}
			else if(array[i] > searched){
				return -1;
			}
			
		}
		
		return -1;
	}
	
	
	/*Ausgabe*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = {3, 8, 12, 17, 21, 25, 31, 40};
        
        

        System.out.println("Index: " + "[1, 2,  3,  4,  5,  6,  7,  8]");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Bitte zu suchende Zahl eingeben: ");
        int gesucht = s.nextInt();
        int index = linearSearch(array, gesucht);
        System.out.println("Gesuchter Wert: " + gesucht);
        System.out.println("Gefunden an Index: " + index);
    }
}
