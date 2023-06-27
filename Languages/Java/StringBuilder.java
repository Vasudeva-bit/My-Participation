// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class insertDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("I Write "); // 8+16
        StringBuilder sb2 = new StringBuilder("I Python ");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        sb1.insert(7, " Java"); // 1 insert
        System.out.println(sb1.capacity());
        sb2.insert(8, sb1); // 2 insert
        System.out.println(sb2);
        sb2.insert(8, ' '); // 3 insert
        System.out.println(sb2);
        sb2.replace(0, 9, "");
        System.out.println(sb2);
        sb1.setCharAt(0, 'U');
        System.out.println(sb1);
        sb1.setLength(2);
        System.out.println(sb1);
        sb1.delete(0, 1);
        System.out.println(sb1.capacity());
        System.out.println(sb1 + " NULL");
        System.out.println(sb2.deleteCharAt(sb2.length()-1));
        System.out.println(sb2.substring(1));
    }
}