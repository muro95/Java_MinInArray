import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        main addArray = new main();
        int size;

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Array not exceed 20");
            }
        } while (size > 20);

        int[] array = new int[size];
        addArray.addElement(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int min = findMin(array);
        System.out.print("Min Num in the Array: " + min );
    }

    static int findMin(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }return min;
    }
    static void addElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
}
