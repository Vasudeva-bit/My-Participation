//Calculate the amount applicable after applying the 5 different rates of interest on same principle in the same bank.

class Bank {
    double time;
    double principle;
    Bank(double time, double principle) {
        this.time = time;
        this.principle = principle;
    }
    class Loan {
        double interest;
        Loan(double interest) {
            this.interest = interest;
        }
        void calAmountAfterInterest() {
            System.out.println("Amount applicable is "+(principle+(interest*time*principle)/100));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank(7, 7000);
        Bank.Loan l1 = b.new Loan(2);
        Bank.Loan l2 = b.new Loan(3);
        Bank.Loan l3 = b.new Loan(5);
        l1.calAmountAfterInterest();
        l2.calAmountAfterInterest();
        l3.calAmountAfterInterest();
    }
}