// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface Student {
    String name = "Vasudeva";
    static void registerCourse() {
        System.out.println("Registering the course on student portal");
    }
}
interface Teacher {
    String name = "Deva";
    static void registerCourse() {
        System.out.println("Registering the course on teacher portal");
    }
}
class LPU implements Student, Teacher {
    public static void main(String[] args) {
        Student.registerCourse();
        Teacher.registerCourse();
// 1. Both are static: No ambiguity
// 2. Both are default: Ambiguity
// 3. One is static and other is default: No ambiguity since the static method need to be called using the interface name and other one without the interface name.
    }
}

// Bala's code
interface Student {
    String name = "Alice";//final, static, public
    void registerACourse();//abstract public
    default void takeAdmission() {//deFAULT, public
        System.out.println("Taking admission");
    }
    static void bookAccomodation(){//static public
        System.out.println("Booking hostel");
    }
}
 class LPU implements Student {
    public void registerACourse() {
        takeAdmission();
        Student.bookAccomodation();
    }
}


@FunctionalInterface
interface Student1 {
    int register(int regno);
    boolean equals(Object o);
    public String toString();
    static void takeAdmission() {
        System.out.println("Admitting in university 1");
    }
}

class Main{
    public static void main(String[] args) {
        Student1 s = (reg) -> {
            System.out.println("Registering");
            return reg;
        };
        s.register(123);
    }
}