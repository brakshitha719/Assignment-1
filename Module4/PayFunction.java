package Assignment.Ass2.Module4;

    // Interface
    interface Payment {
        void pay(double amount);
    }

    // Credit card payment implementation
    class CreditCardPayment implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card.");
        }
    }

    // UPI payment implementation
    class UPIPayment implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI.");
        }
    }

    // Main class
    public class PayFunction {
        public static void main(String[] args) {

            Payment credit = new CreditCardPayment();
            Payment upi = new UPIPayment();

            credit.pay(1500.00);
            upi.pay(750.50);
        }
    }
