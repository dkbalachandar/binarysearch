import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = scanner.nextInt();
        System.out.println("Number to Search:");
        int element = scanner.nextInt();
        if (n == 0 || element == 0) {
            System.out.println("Invalid Number");
            System.exit(0);
        }
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Position is " + binarySearch(array, 0, array.length, element));
    }

    private static int binarySearch(int[] array, int start, int last, int element) {

        if (start <= last) {
            int middle = (start + last) / 2;
            if (array[middle] == element) {
                return middle;
            } else if (array[middle] > element) {
                return binarySearch(array, start, middle, element);
            } else if (array[middle] < element) {
                return binarySearch(array, middle + 1, last, element);
            }
        }
        return -1;
    }
}
