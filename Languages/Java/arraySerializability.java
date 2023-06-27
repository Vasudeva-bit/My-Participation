import java.io.*;
import java.util.*;
import java.lang.*;

class Laptop implements Serializable
{
    String brandName;
    String modelNo;
    int warrantyYears;
    Laptop(String brandName, String modelNo, int warrantyYears)
    {
        this.brandName = brandName;
        this.modelNo = modelNo;
        this.warrantyYears = warrantyYears;
    }
}

class arraySerializability {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of objects: ");
        int n = scan.nextInt();
        Laptop lp[] = new Laptop[100];
        ObjectOutputStream os = null;
        FileOutputStream fos = null;
        try {
            File f = new File("fileS.txt");
            fos = new FileOutputStream(f);
            os = new ObjectOutputStream(fos);
            System.out.println("Enter the details of " +n+ " objects");
            for(int i=0;i<n;i++) {
                String brandName = scan.next();
                String modelNo = scan.next();
                int warrantyYears = scan.nextInt();
                lp[i] = new Laptop(brandName, modelNo, warrantyYears);
                os.writeObject(lp[i]);
            }
        }
        catch(IOException ioe) {
            System.out.println("Error in writing to file");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("fileS.txt"));
            int i = 0;
            lp[i] = (Laptop)ois.readObject();
            while(lp[i] != null) {
                System.out.println(lp[i].brandName);
                System.out.println(lp[i].modelNo);
                System.out.println(lp[i].warrantyYears);
                i++;
                lp[i] = (Laptop)ois.readObject();
            }            
        }
        catch(IOException ioe) {
            System.out.println("Error in reading to file");
        }
        catch(ClassNotFoundException cnfe) {
            System.out.println("Error in reading the object");
        }
    }
}