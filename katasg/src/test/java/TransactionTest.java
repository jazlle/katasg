import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class TransactionTest {

    @Test
    void testToString() {
        Date date = new Date();
        String expectedDate = computeDate(date);
        BigDecimal amount = new BigDecimal(100);
        BigDecimal balance = new BigDecimal(200);
        Transaction transaction = new Transaction(date, amount, balance);

        String result = transaction.toString();

        String expectedResult = new StringBuilder().append("Date : ").append(expectedDate)
                .append(String.format("\n"))
                .append("Amount : ").append(amount.toString())
                .append(String.format("\n"))
                .append("Final balance : ").append(balance)
                .append(String.format("\n"))
                .append("-----").append(String.format("\n")).toString();

        Assertions.assertEquals(expectedResult, result);
    }

    private String computeDate(Date date){
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
}