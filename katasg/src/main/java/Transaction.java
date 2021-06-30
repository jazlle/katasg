import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private final BigDecimal amount;
    private final BigDecimal balance;
    private final Date date;

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }

    public Transaction(Date date, BigDecimal amount, BigDecimal balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }
}