import java.util.Scanner;

/**
 * Created by anshul on 08/02/19.
 */
public class ATMDispenser {
    private DispenseCurrency c1;

    public ATMDispenser() {
        this.c1 = new Dollar50DIspenser();
        DispenseCurrency c2 = new Dollar20DIspenser();
        DispenseCurrency c3 = new Dollar10DIspenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenser atmDispenser = new ATMDispenser();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount shud be in multiple of 10");
                return;
            }

            atmDispenser.c1.dispense(new Currency(amount));

        }
    }
}
