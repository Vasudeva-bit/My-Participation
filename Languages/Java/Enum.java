import java.util.*;
import java.lang.*;
// public enum Season {SUMMER, WINTER, SPRING}; 
// How to access a enum type declared outside the class?
public class EnumDemo {
    public enum Season {
        SUMMER, WINTER, SPRING, SUMMER(); // Parameterized constructor ?
        int code;
        String[] map = {"SUMMER", "WINTER", "SPRING"};
        // Default constructor
        Season() {}
        Season(int code) {
            this.code = code;
        }
        Season getSeason() {
            return Season.valueOf(map[code]); 
        }
    };
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value among the Enum constants");
        String userIn = scan.next();
        Season s = Season.valueOf(userIn);
        // Loop over the enum
        for(Season S: Season.values()) {System.out.println(S)};
        // Switch case branching based on enum values
        switch(s) {
            case SUMMER: System.out.println("Summer season");
                break;
            case WINTER: System.out.println("Winter season");
                break;
            case SPRING: System.out.println("Spring season");
                break;
            default: System.out.println("No Season");
        }
    }
}