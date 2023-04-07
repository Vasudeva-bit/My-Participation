import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student 
{
   double cgpa;
  Student(double cgpa)
  {
      this.cgpa = cgpa;
  }
}

interface CompanyNorms
{
  boolean isEligible(Student st);
}

class PlacementPortal
{
    void filterStudents(Student [] arr, CompanyNorms ob)
    {
        int count = 0;
        for(Student st : arr)
        {
        	if(ob.isEligible(st)) count ++;
        }
        System.out.print(count + " ");
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Student s[] = new Student[n];
        for(int i=0;i<n;i++) {
            double val = scan.nextDouble();
            s[i] = new Student((val));
        }
        final double cnmin1 = scan.nextDouble();
        CompanyNorms cn1 = (stu)-> {
            if(stu.cgpa >= cnmin1)
                return true;
            return false;
        };
        PlacementPortal pp = new PlacementPortal();
        pp.filterStudents(s, cn1);
        final double cnmin2 = scan.nextDouble();
        CompanyNorms cn2 = (stu)-> {
            if(stu.cgpa >= cnmin2)
                return true;
            return false;
        };
        pp.filterStudents(s, cn2);
        final double cnmin3 = scan.nextDouble();
        CompanyNorms cn3 = (stu)-> {
            if(stu.cgpa >= cnmin3)
                return true;
            return false;
        };
        pp.filterStudents(s, cn3);
    }
}