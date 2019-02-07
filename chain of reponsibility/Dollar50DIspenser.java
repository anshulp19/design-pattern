/**
 * Created by anshul on 08/02/19.
 */
public class Dollar50DIspenser implements DispenseCurrency {
    private DispenseCurrency chain;

    @Override
    public void setNextChain(DispenseCurrency nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if (curr.getAmount() >= 50) {
            int num = curr.getAmount() / 50;
            int remainder = curr.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50 USD notes");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(curr);
        }
    }
}
