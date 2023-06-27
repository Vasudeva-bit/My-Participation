//Calculate the amount applicable after applying the 5 different rates of interest on same principle in the same bank.

class Bank {
    static int time;
    class Loan {
        double interest;
        void calAmountAfterInterest() {
            System.out.println("Interest is calculated!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Bank.Loan l1 new Bank().new Loan() // a bank (outer class) object is created and a loan (inner class) object is also created. However, the outer class object is not used or assigned to any variable.
        Bank b = new Bank(); // The variable b is reused while creating more Loan objects.
        // In the first example, the bank object is created multiple times since no dedicated variable is used.
        Bank.Loan l2 = b.new Loan();
        Bank.Loan l3 = b.new Loan();
    }
}