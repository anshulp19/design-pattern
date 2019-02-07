/**
 * Created by anshul on 08/02/19.
 */
public class Dollar20DIspenser implements DispenseCurrency {
    private DispenseCurrency chain;

    @Override
    public void setNextChain(DispenseCurrency nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if (curr.getAmount() >= 20) {
            int num = curr.getAmount() / 20;
            int remainder = curr.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20 USD notes");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(curr);
        }
    }
}
