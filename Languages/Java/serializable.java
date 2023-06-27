import java.io.*;
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
class Main {
    public static void main(String args[]) {
        Laptop lp = new Laptop("DELL", "Inspiron", 3);
        ObjectOutputStream os = null;
        FileOutputStream fos = null;
        try {
            File f = new File("fileS.txt");
            fos = new FileOutputStream(f);
            os = new ObjectOutputStream(fos);
            os.writeObject(lp);
        }
        catch(IOException ioe) {
            System.out.println("Error in writing to file");
        }
        finally {
            os.close();
            fos.close();
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("fileS.txt"));
            Laptop lp = (Laptop)ois.readObject();
            System.out.println(lp.brandName);
            System.out.println(lp.modelNo);
            System.out.println(lp.warrantyYears);
        }
        catch(IOException ioe) {
            System.out.println("Error in writing to file");
        }
        finally {
            ois.close();
        }
    }
}
/*
The process of writing objects of a class into a file is called Serializing. The objects of a class, which implements the interface Serializable only can be written to a file. 
Invoking the methods using the objects return in a file is called remoting invoking (Distributed systems).
*/