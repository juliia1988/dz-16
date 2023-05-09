import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000",50,"USD");
//            bankApplication.process("accountId001",50,"EUR");
//            bankApplication.process("accountId001",30,"USD");
//            bankApplication.process("accountId001",100,"USD");
//            bankApplication.process("accountId001",100,"USD");

        } catch (WrongAccountException e) {
            System.out.println("Please check account Id");
        } catch (WrongCurrencyException e) {
            System.out.println("Please check currency");
        } catch (WrongOperationException e) {
            System.out.println("Please check balance");
        } catch (Exception exception) {
            System.out.println("Got processing error, please try later");
        } finally {
            System.out.println("Thank for using our bank");
        }
    }
}
