import java.math.BigDecimal;

public class Account {

    private Statement statement;

    private BigDecimal balance;

    public Account() {
        statement = new Statement();
        balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal value) {
    }

    public void withdraw(BigDecimal value) {
    }

    public void showAccountStatement() {
        this.statement.printStatement();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Statement getStatement() {
        return statement;
    }
}