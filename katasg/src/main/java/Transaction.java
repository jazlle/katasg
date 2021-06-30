import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private final BigDecimal amount;
    private final BigDecimal balance;
    private final Date date;
    private final Action action;

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }

    public Action getAction() { return action;}

    public Transaction(Date date, BigDecimal amount, BigDecimal balance, Action action) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.action = action;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String computedDate = computeDate(date);
        String computedAmount = computeAmount(amount, action);
        return stringBuilder
                .append("Date : ").append(computedDate)
                .append(String.format("\n"))
                .append("Amount : ").append(computedAmount)
                .append(String.format("\n"))
                .append("Final balance : ").append(balance)
                .append(String.format("\n"))
                .append("-----").append(String.format("\n")).toString();
    }

    private String computeDate(Date date){
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    private String computeAmount(BigDecimal amount, Action action){
        switch(action){
            case WITHDRAW:
                return amount.negate().toString();
            case DEPOSIT:
            default:
                return amount.toString();
        }
    }
}