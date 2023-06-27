import java.util.*;
import java.io.*;
import java.lang.*;

public class CollecN {
    public static void main(String args[]) {
        ArrayList actress = new ArrayList();
        actress.add("Nazriya");
        actress.add("Rashmika");
        actress.add("Pooja Hegde");
        actress.add("Samantha");
        System.out.println(actress);
        if(actress.contains("Samantha"))
            System.out.println("Sam is in the list");
        if(actress.remove("Samantha")) 
            System.out.println("Sam is removed from list");
        if(!actress.contains("Samantha"))
            System.out.println("Sam's counter is decremented");
        ArrayList<String> actors = new ArrayList();
        actors.add("Vasudeva K");
        actors.add("Sujith");
        actors.add("Sai Kota");
        actors.addAll(actress);
        System.out.println(actors);
        System.out.println(actors.size());
    }
}