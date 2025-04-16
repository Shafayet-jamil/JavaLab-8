import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your initial account balance: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
//        int refund;
        CreditCard one = new CreditCard("Jamil", "4145254125425416");
        one.authorizePayment(amount);
        one.processPayment(amount);
        one.refundPayment(amount);

        PayPal two = new PayPal("maxlogfiles.com", 1234);
       two.authorizePayment(amount);
       two.processPayment(amount);
       two.refundPayment(amount);

    }
}
