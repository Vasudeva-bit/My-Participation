import java.io.*;
import java.util.*;
import java.lang.*;

class fileSerializable {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the id of the master: ");
        int id = scan.nextInt();
        System.out.println("Enter the name of the master: ");
        String fname = scan.next();
        File file = new File(fname + "_" + id + ".txt");
        File fileE = new File(fname + "_" + id + "E.txt");
        File fileN = new File(fname + "_" + id +"N.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File is created");
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch(IOException ioe) {
            System.out.println("File could not be created");
        }
        FileWriter fw = null;
        FileWriter fwE = null;
        FileWriter fwN = null;
        try {
            fw = new FileWriter(file, true);
            fwE = new FileWriter(fileE, true);
            fwN = new FileWriter(fileN, true);
            System.out.println("Enter the no of family members:");
            int n = scan.nextInt();
            fw.write("Data below");
            fwE.write("Data below");
            fwN.write("Data below");
            for(int i=0;i<n;i++) {
                System.out.println("Enter the age of the member: ");
                int age = scan.nextInt();
                System.out.println("Enter the name of the member: ");
                String name = scan.next();
                if(age >= 18) {
                    fwE.write("\n"+name+"\n");
                    fwE.write(""+age+"");
                    fwE.flush();
                }
                else {
                    fwN.write("\n"+name+"\n");
                    fwN.write(""+age+"");
                    fwN.flush();
                }
                fw.write("\n"+name+"\n");
                fw.write(""+age+"");
                fw.flush();
            }
        }
        catch(IOException ioe) {
            System.out.println("Some error writing into the file");
        }
        System.out.println("Reading the eligible members");
        Scanner fscan = new Scanner(fileE);
        while(fscan.hasNext()) {
            System.out.println(fscan.next());
        }
    }
}