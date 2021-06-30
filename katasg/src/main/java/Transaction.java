import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String computedDate = computeDate(date);
        return stringBuilder
                .append("Date : ").append(computedDate)
                .append(String.format("\n"))
                .append("Amount : ").append(amount)
                .append(String.format("\n"))
                .append("Final balance : ").append(balance)
                .append(String.format("\n"))
                .append("-----").append(String.format("\n")).toString();
    }

    private String computeDate(Date date){
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

}