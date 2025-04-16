import java.util.Scanner;

public class CreditCard implements PaymentMathod{
    public String cardHolderName;
    public String cardNumber;
    public double totalcreditAmount;
    CreditCard(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }


    @Override
    public boolean authorizePayment(double amount) {
        if(cardNumber.length() == 16 && cardNumber.charAt(0) == '4') {
            return true;
        }
        return false;
    }

    @Override
    public void processPayment(double amount) {
          if(authorizePayment(amount)) {
              System.out.println("How much do you want to process or add to your credit card  balance?: ");
              Scanner sc = new Scanner(System.in);
              int add = sc.nextInt();
             totalcreditAmount = amount+add;
             System.out.println("Your credit card balance is: " + totalcreditAmount);
              System.out.println("Your credit card has been successfully processed!");
          }
          else{
              System.out.println("Your credit card has been  authentication failed!");
          }
    }

    @Override
    public void refundPayment(double amount) {
          if(authorizePayment(amount)) {

              System.out.println("How much do you want to refund Credit Card? Enter amount: ");
              Scanner input = new Scanner(System.in);
              int refundAmount = input.nextInt();
              totalcreditAmount = amount+refundAmount;
              System.out.println("Your new Credit Card balance is: " + totalcreditAmount);
              System.out.println("Your credit card has been successfully refunded!");
          }
          else{
              System.out.println("Your credit card has been refunding failed! Because of an error!");
          }
    }
}
