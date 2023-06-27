import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int k=sc.nextInt();
            a.add(k);
        }

        ListIterator<Integer> it = a.listIterator();
        while(it.hasNext())
        {
            if(it.next()==10)
            { 
                 it.previous();
                it.add(20);
                it.next();
                while(it.hasNext() && it.next()==10)
                {

                } 
                
            }

        }
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i) + " ");
        }
        sc.close();
    }

}