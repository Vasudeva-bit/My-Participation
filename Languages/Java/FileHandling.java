import java.io.*;
import java.util.*;
class FileHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File f = new File("D:\\Work Space\\Fourth Semester\\CSE 310\\file1.txt"); // Absolute path
        // File f = new File("file1.txt"); // Relative path
        // File f = new File("D:\\Work Space\\Fourth Semester\\CSE 311\\file2.txt"); // Invalid path - caught by the IOException
        /* File theDir = new File("directory");
        if (!theDir.exists()){
            theDir.mkdirs();
            System.out.println("Directory is created");
        }
        */
        try {
            if(f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch(IOException ioe) {
            System.out.println("File could not be created");
        }
        FileWriter fw = null;
        try {
            System.out.println("Size of file 1: "+f.length());
            fw = new FileWriter(f, true); // the second parameter is the append pararm
            fw.write("Below is the cars dataset!"); // this can also be write string variables into the file
            fw.flush(); // kinda of push command on git
        }
        catch(IOException ioe) {
            System.out.println("Some error writing into the file");
            // This IOException is thrown if the file path given to the file wrtier is a directory path or the permissions of the file are restricted to writing
            // IOException also occures if the file path is invalid or doesn't exist
        }
        System.out.println("The current size of the file is: "+f.length());
        System.out.println("Enter the no of car models to enter into the file: ");
        int noCars = scan.nextInt();
        try {
            for(int i=0;i<noCars;i++) {
                System.out.println("Enter the name, price and modelNo");
                String name = scan.next();
                double price = scan.nextDouble();
                int modelNo = scan.nextInt();
                fw.write("\nName: "+name+"\nPrice: "+price+"\nModel: "+modelNo);
            }
            fw.close();
        }
        catch(IOException ioe) {
            System.out.println("Some error while writing into the file");
        }
        try {
            Scanner scanf = new Scanner(f);
            while(scanf.hasNextLine()) {
                System.out.println(scanf.nextLine());
            }
        }
        catch(IOException ioe) {
            System.out.println("Some error occcured while reading the file");
        }
    }
}

/*
Methods of file class:
1. boolean isFile()
2. boolean isDirectory()
3. boolean isHidden()
4. boolean exists()
5.         canRead()
6.         canWrite()
7. String getName()
8. String getPath()
9. long lastModified()
10. long length()
11. boolean delete()
12. booelan renameTo(File f)
13. File[] listFiles() - Used to list all the files inside the directory, returns the array of objects
Syntax: File[] list = <directory object>.listFiles[]; - directory object defined using new File("path")



Reading from files using scanner object:
1. scan.hasNextLine(): return true if there is any text/data on the next line
2. scan.nextLine(): returns the data on the next line
3. scan.hasNext(): returns true if there is any data next to the current pointer, works on same line as well (google it)

Reading from files using FileReader:

Reading from files using InputStream

*/