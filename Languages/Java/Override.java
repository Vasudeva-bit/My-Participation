import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.roll > o.roll)
            return 1;
        else if (this.roll < o.roll)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return this.roll + " : " + this.name;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "John"));
        al.add(new Student(2, "Jay"));
        al.add(new Student(4, "Henry"));
        al.add(new Student(3, "Alice"));
        Collections.sort(al);
        System.out.println(al);
    }
}