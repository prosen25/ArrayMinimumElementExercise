import java.util.Scanner;

public class MinimumElement {

    public static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        return scanner.nextInt();
    }

    public static int[] readElements(int length) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + length + " integer values:\r");
        int[] inputArray = new int[length];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        return inputArray;
    }

    public static int findMin(int[] inputArray) {

        int minValue = inputArray[0];
        for (int item : inputArray) {
            if (minValue > item) {
                minValue = item;
            }
        }

        return minValue;
    }
}
