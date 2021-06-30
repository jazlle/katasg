import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class AccountTest {

    @Test
    void deposit_and_withdraw_with_positive_value() {
        Account account = new Account();
        Assertions.assertEquals(account.getBalance(), BigDecimal.ZERO);
        BigDecimal valueToDeposit = new BigDecimal(100);
        Assertions.assertEquals(account.getStatement().getListTransaction().isEmpty(), true);
        account.deposit(valueToDeposit);
        Assertions.assertEquals(account.getBalance(), valueToDeposit);
        Assertions.assertEquals(account.getStatement().getListTransaction().size(), 1);
        account.withdraw(valueToDeposit);
        Assertions.assertEquals(account.getBalance(), BigDecimal.ZERO);
        Assertions.assertEquals(account.getStatement().getListTransaction().size(), 2);
    }

    @Test
    void deposit_with_negative_value() {
        Account account = new Account();
        Assertions.assertEquals(account.getBalance(), BigDecimal.ZERO);
        BigDecimal valueToDeposit = new BigDecimal(-100);
        account.deposit(valueToDeposit);
        Assertions.assertEquals(account.getStatement().getListTransaction().isEmpty(), true);
        Assertions.assertEquals(account.getBalance(), BigDecimal.ZERO);
    }

    @Test
    void withdraw_with_negative_value() {
        Account account = new Account();
        Assertions.assertEquals(account.getBalance(), BigDecimal.ZERO);
        BigDecimal valueToDeposit = new BigDecimal(100);
        account.deposit(valueToDeposit);
        Assertions.assertEquals(account.getBalance(), valueToDeposit);
        Assertions.assertEquals(account.getStatement().getListTransaction().size(), 1);
        BigDecimal negativeValueToWithdraw = new BigDecimal(-100);
        account.withdraw(negativeValueToWithdraw);
        Assertions.assertEquals(account.getBalance(), valueToDeposit);
        Assertions.assertEquals(account.getStatement().getListTransaction().size(), 1);
    }
}