class Bank {
    double time;
    double principle;
    Bank(double time, double principle) {
        this.time = time;
        this.principle = principle;
    }
    void processPayment(int interest) {
        class Loan {
            double interest;
            Loan(double interest) {
                this.interest = interest;
            }
            void calAmountAfterInterest() {
                System.out.println("Amount applicable is "+(principle+(interest*time*principle)/100));
                // All the variable larger scope (belonging to outer blocks) are accessible inside the inner class.
            }
        }
        Loan l = new Loan(interest);
        l.calAmountAfterInterest();
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank(7, 7000);
        b.processPayment(2);
    }
}