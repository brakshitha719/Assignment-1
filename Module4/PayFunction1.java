package Assignment.Ass1and2.Module4;

    // Interface
    interface Payment1 {
        void pay(double amount);
    }

    // Credit card payment implementation
    class CreditCardPayment1 implements Payment1{

        @Override
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card.");
        }
    }

    // UPI payment implementation
    class UPIPayment1 implements Payment1 {

        @Override
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI.");
        }
    }

    // Main class
    public class PayFunction1 {
        public static void main(String[] args) {

            Payment1 credit = new CreditCardPayment1();
            Payment1 upi = new UPIPayment1();

            credit.pay(1500.00);
            upi.pay(750.50);
        }
    }
