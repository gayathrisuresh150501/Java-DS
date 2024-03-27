import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,7,5,3,9,0};
        System.out.println("Enter the element to be searched: ");

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(returnIndex(arr, target));
        System.out.println(returnElement(arr, target));
        System.out.println(doesExist(arr, target));
    }
    public static int returnIndex(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int returnElement(int[] arr, int target) {
        if (arr.length == 0) return Integer.MIN_VALUE;

        for (int j : arr) {
            if (j == target) {
                return j;
            }
        }

        return Integer.MAX_VALUE;
    }

    public static boolean doesExist(int[] arr, int target) {
        if (arr.length == 0) return false;

        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }

        return false;
    }
}
