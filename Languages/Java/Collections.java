import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    int marks;

    Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        if (this.marks > s.marks)
            return 1;
        else if (this.marks == s.marks)
            return 0;
        else
            return -1;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, 90));
        al.add(new Student(2, 85));
        al.add(new Student(3, 89));
        al.add(new Student(4, 88));

        Collections.sort(al);

        for (Student st : al) {
            System.out.println(st.roll + " : " + st.marks);
        }
    }
}
