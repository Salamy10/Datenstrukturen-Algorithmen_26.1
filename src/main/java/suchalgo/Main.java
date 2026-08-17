package suchalgo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello dear students of the course 'Algorithmen & Datenstrukturen' :) !");
        System.out.println("Let us test your Code:");


        int[] array = {
                10, 20, 30, 40, 50,
                60, 70, 80, 90
        };

        System.out.println(
                BinarySearch.binarySearch(array, 50)
        );

        System.out.println(
                BinarySearch.binarySearch(array, 10)
        );

        System.out.println(
                BinarySearch.binarySearch(array, 90)
        );

        System.out.println(
                BinarySearch.binarySearch(array, 55)
        );
    }
}


