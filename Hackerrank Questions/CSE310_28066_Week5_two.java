import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements of first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size and elements of second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Input size and elements of third array
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        // Find common elements
        ArrayList<Integer> common = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        // Print common elements in ascending order
        if (common.isEmpty()) {
            System.out.println("No common elements");
        } else {
            Collections.sort(common);
            for (int x : common) {
                System.out.print(x + " ");
            }
        }
    }
}