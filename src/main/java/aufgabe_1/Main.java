package aufgabe_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello dear students of the course 'Algorithmen & Datenstrukturen' :) !");
        System.out.println("Let us test your Code:");


        // Hier eine Beliebige Testzahl einfügen
        long test = 7;
        System.out.println(fibo_rec(test));
        System.out.println(fibo_iter(test));
    }



    // Rekursive Fibonacci Implementierung
    public static long fibo_rec(long input){

    	if (input <= 0) {
    		return 0;
    	} else if(input == 1){
    		return 1;
    	}
		return fibo_rec(input-1) + fibo_rec(input-2);
    	
    }


    // Iterative Fibonacci Implementierung
    public static long fibo_iter(long input){

    	if (input <= 0) {
    		return 0;
    	} else if(input == 1){
    		return 1;
    	}    	
    	
    	long prev = 0;
    	long current = 1;
    	
    	for(long i = 2; i <= input; i++) {
    		long next = prev + current;
    		prev = current;
    		current = next;
    	}

        return current;
    }

}