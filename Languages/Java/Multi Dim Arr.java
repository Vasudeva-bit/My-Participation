import java.util.*;
import java.lang.*;
public class ArrMD {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 11, 12, 13}; // Alternative way of declaring and initailizing a single dim array
        int[][] intArr = new int[3][];
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[8];
        intArr[0] = arr1;
        intArr[1] = arr2;
        intArr[2] = arr3;
        int[][] intArray = {arr1, arr2, arr3};
        int[][] intAray = {arr1, {1, 2, 4}, {100, 150, 200}};
        int[][] intArra = {{1, 2, 3}};
    }
}