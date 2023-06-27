class Threading {
    void display() throws InterruptedException{
        for(int i=10;i>=1;i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }
    public static void main(String args[]) throws InterruptedException{
        Threading thread = new Threading();
        thread.display(); // Error propagation: error thrown some in the stack is propagated to all the methods above in
        // in the stack.
        // throws InterruptedException for the main method avoids the error
    }
}