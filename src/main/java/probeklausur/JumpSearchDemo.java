package probeklausur;
import java.util.Arrays;
import java.util.Scanner;

public class JumpSearchDemo {

	
	/*Suchalgo*/
	public static int jumpSearch(int[] array, int gesucht) {
	    int n = array.length;
	    if (n == 0) return -1;

	    int schrittweite = (int) Math.sqrt(n);
	    int start = 0;
	    int ende = schrittweite;

	    // 1. Sprünge durchführen: 
	    // Vergleiche den WERT im Array (array[ende - 1]) mit gesucht
	    while (ende < n && array[ende - 1] < gesucht) {
	        start = ende;
	        ende += schrittweite;
	    }

	    // 2. Ende auf die tatsächliche Array-Länge begrenzen
	    int echtesEnde = Math.min(ende, n);

	    // 3. Lineare Suche vorwärts von start bis echtesEnde - 1
	    for (int i = start; i < echtesEnde; i++) {
	        if (array[i] == gesucht) {
	            return i;
	        }
	    }

	    return -1;
	}

    
    /*Ausgabe*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = {2, 5, 8, 12, 16, 21, 27, 31, 38, 45, 51, 60};
        
        

        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Bitte zu suchende Zahl eingeben: ");
        int gesucht = s.nextInt();
        int index = jumpSearch(array, gesucht);
        System.out.println("Gesuchter Wert: " + gesucht);
        System.out.println("Gefunden an Index: " + index + " an " + (index+1) + ". Stelle.");
    }
}