import java.math.BigDecimal;
import java.util.*;

public class Statement {

    private List<Transaction> listTransaction;

    public Statement() {
        listTransaction = new ArrayList<>();
    }

    public void addTransaction(Date date, BigDecimal amount, BigDecimal balance) {
        Transaction newTransaction = new Transaction(date, amount, balance);
        listTransaction.add(newTransaction);
    }

    public void printStatement() {
        for(Transaction transaction: listTransaction){
            System.out.println(transaction.toString());
        }
    }

    public List<Transaction> getListTransaction() {
        return listTransaction;
    }
}
