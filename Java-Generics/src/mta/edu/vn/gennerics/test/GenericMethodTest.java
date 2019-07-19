package mta.edu.vn.gennerics.test;

public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E elment : inputArray) {
            System.out.println(elment + " ");
        }
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double and character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'P', 'H', 'A', 'N', 'V', 'A', 'N', 'H', 'A', 'I'};

        System.out.println("Array Integer contains: ");
        printArray(intArray);

        System.out.println("Array Double contains: ");
        printArray(doubleArray);

        System.out.println("Array Character contains: ");
        printArray(charArray);
    }
}
