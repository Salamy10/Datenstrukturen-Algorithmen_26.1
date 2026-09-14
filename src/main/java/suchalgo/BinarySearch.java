package suchalgo;


public class BinarySearch {

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int value, int left, int right) {
        //Implementieren
    	
    	if(left>right) {
        	return -1;
        }
    	
    	int middle = (left + right)/2;
    	
    	if(array[middle] == value) {
    		return middle;
    	}
    		
    	if(value < array[middle]){
    		binarySearch(array, value, left, middle - 1);
    	}
    	
    	return binarySearch(array, value, middle+1, right);
    	
    	     
        
    }

}