class toCharArray {
    public static void main(String[] args) {
        String s = "Deva";
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++) {
            if(c[i] >= 65 && c[i] <= 90)
                c[i] += 32;
                System.out.print(c[i]);
        }
        // equals(), equalsIgnoreCase(), getchars(srcBegin, srcEnd, destVar, destBegin)
    }
}
class Equals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        if(a.equals(b)) // pointing to different memory locations
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}