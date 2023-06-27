import java.io.*;
import java.util.*;
import java.lang.*;
class Main {
    public static void main(String args[]) throws IOException {
        File f = new File("file1.txt");
        Scanner scan = new Scanner(System.in);
        OutputStream os = null;
        try {
            os = new FileOutputStream(f, true);
            int n = scan.nextInt();
            for(int i=0;i<n;i++) {
                String st;
                System.out.println("Enter the name "+i);
                st = scan.nextLine();
                st = st.substring(st.lastIndexOf(' ')+1)+"\n";
                os.write(st.getBytes());
            }
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Some error while opening or writing to the file");
        }
    }
}