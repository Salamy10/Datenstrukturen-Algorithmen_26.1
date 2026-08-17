package suchalgo;


public class BinarySearch {

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int value, int left, int right) {
        //Implementieren
    	int pivotpos = (left + right)/2;
    	
    	if(array[pivotpos] == value) {
    		return pivotpos;
    	}else if(array[pivotpos] < value){
    		left = pivotpos + 1;
    	}else if(array[pivotpos] > value){
    		right = pivotpos - 1;
    	}else {
    		binarySearch(array, value);
    	}
        return -1;
    }

}