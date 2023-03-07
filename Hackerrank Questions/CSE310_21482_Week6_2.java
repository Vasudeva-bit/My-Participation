import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchStr = scanner.nextLine().trim();
        String text = scanner.nextLine().trim();
        int count = 0;
        int index = text.indexOf(searchStr);
        while (index != -1) {
            count++;
            index = text.indexOf(searchStr, index + 1);
        }

        System.out.println(count);
    }
}