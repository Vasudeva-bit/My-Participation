interface Bank {
    void carLoan();
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank() {
            public void carLoan() {
                System.out.println("Defining the methd carLoan using anonymous class");
                // Local class, used to give definition to the abstract method of abstract classes or interfaces.
                // Multiple methods can be added in addition, but they can't be invoked due to the policy, "Parents reference can't invoke the extra methods of the child class."
            }
        }
        
    }
}