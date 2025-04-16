import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayPal implements PaymentMathod{
    public String email;
    public int password;
    public double totalpaypalAmount;
    public PayPal(String email, int password) {
        this.email = email;
        this.password = password;

    }


    @Override
    public boolean authorizePayment(double amount) {
        return Pattern.matches(email, email);
    }

    @Override
    public void processPayment(double amount) {
        if(authorizePayment(amount)) {
            System.out.println("How much do you want to process or add to your paypal balance?: ");
            Scanner sc = new Scanner(System.in);
            int add = sc.nextInt();
            totalpaypalAmount = amount + add;
            System.out.println("Your Request is sent to the Payment Management System and precess successful.");
            System.out.println("Your paypal balance is: " + totalpaypalAmount);
        }
        else{
            System.out.println("Your authentication is failed. Please try again.");
        }
    }

    @Override
    public void refundPayment(double amount) {
        if(authorizePayment(amount)) {
            System.out.println("How much do you want to refund in paypal? Enter amount: ");
            Scanner input = new Scanner(System.in);
            int refundAmount = input.nextInt();
            totalpaypalAmount = amount + refundAmount;
            System.out.println("Your new paypal balance is: " + totalpaypalAmount);
            System.out.println("Your Request form paypal is sent for refund team and precess successful.");

        }
        else{
            System.out.println("Your authentication is failed. Please try again.");
        }
    }
}
