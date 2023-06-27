interface Computer {
    void work();
    static void playMusic() {
        System.out.println("Playing music");
    }
    default void playGame() {
        System.out.println("Playing game");
    }
}
interface portableComputer {
    void work();
    // void playMusic();
    static void playGame() {
        System.out.println("Playing game");
    }
}
class Laptop implements Computer, portableComputer {
    public void work() {
        System.out.println("Writing code");
    }
    // public void playMusic() {
    //     System.out.println("Playing music on the laptop");
    // }
}
class Main {
    public static void main(String args[]) {
        Laptop lappy = new Laptop();
        lappy.work();
        // lappy.playMusic(); error since static methods can't be invoked using the object of the class
        // Laptop.playMusic(); error since static methods can't be invoked using the implemented class
        Computer.playMusic(); // only way to invoke the static method in any interface
    }
}
// Multi-level inheritence or implementations (heirarchy is followed)
// If there are two parent interfaces having same abstract method, -
// it is compulsory to redefine the method in the child class that implemented the parent interfaces.

// Default method provides flexibility to allow interface define implementation which will be used as default in the situation -
// where a concrete class fails to provide an implementation for that method.

// Inheritence + Implementation -> extends first and implements next.
// Single Abstract Method (SAM) jdk8