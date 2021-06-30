import java.math.BigDecimal;
import java.util.Date;

public class Account {

    private Statement statement;

    private BigDecimal balance;

    public Account() {
        statement = new Statement();
        balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal value) {
        if (Utils.isPositive(value)) {
            statement.addTransaction(new Date(), value, balance);
            this.balance = this.balance.add(value);
        }
    }

    public void withdraw(BigDecimal value) {
        if (Utils.isPositive(value) && balance.compareTo(value) >= 0) {
            statement.addTransaction(new Date(), value, balance);
            this.balance= this.balance.subtract(value);
        }
    }

    public void showAccountStatement() {
        this.statement.printStatement();
    }

    public void showAccountStatement(int quantity) {
        this.statement.printStatement(quantity);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Statement getStatement() {
        return statement;
    }
}