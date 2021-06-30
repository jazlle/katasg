import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

class StatementTest {

    @Test
    void addTransaction() {
        Statement statement = new Statement();
        Date date = new Date();
        BigDecimal amount = new BigDecimal(100);
        BigDecimal balance = new BigDecimal(200);

        statement.addTransaction(date, amount, balance);

        for(Transaction transaction : statement.getListTransaction()) {
            Assertions.assertEquals(transaction.getDate(), date);
            Assertions.assertEquals(transaction.getAmount(), amount);
            Assertions.assertEquals(transaction.getBalance(), balance);
        };

        Assertions.assertEquals(statement.getListTransaction().size(), 1);
    }
}