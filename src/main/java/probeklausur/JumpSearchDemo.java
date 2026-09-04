package probeklausur;
import java.util.Arrays;
import java.util.Scanner;

public class JumpSearchDemo {

    public static int jumpSearch(int[] array, int gesucht) {
        int n = array.length;
        if (n == 0) return -1;

        int schrittweite = (int) Math.sqrt(n);
        int start = 0;
        int ende = schrittweite;

        // 1. Sprungphase: Bereich eingrenzen
        while (ende < n && array[ende - 1] < gesucht) {
            start = ende;
            ende += schrittweite;
        }

        // 2. Lineare Suche im gefundenen Bereich
        int rechteGrenze = Math.min(ende, n);
        for (int i = start; i < rechteGrenze; i++) {
            if (array[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = {3, 8, 12, 17, 21, 25, 31, 40};
        
        

        System.out.println("Array: " + Arrays.toString(array));
        int gesucht = s.nextInt();
        int index = jumpSearch(array, gesucht);
        System.out.println("Gesuchter Wert: " + gesucht);
        System.out.println("Gefunden an Index: " + index);
    }
}