/**
 * Created by anshul on 08/02/19.
 */
public interface DispenseCurrency {
    void setNextChain(DispenseCurrency nextChain);

    void dispense(Currency curr);
}
