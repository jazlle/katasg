import java.math.BigDecimal;
import java.util.*;

public class Statement {

    private List<Transaction> listTransaction;

    public Statement() {
        listTransaction = new ArrayList<>();
    }

    public void addTransaction(Date date, BigDecimal amount, BigDecimal balance, Action action) {
        Transaction newTransaction = new Transaction(date, amount, balance, action);
        listTransaction.add(newTransaction);
    }

    public void printStatement(int quantityToPrint) {
        int index = 0;
        for(Transaction transaction: listTransaction){
            if(++index >= quantityToPrint) {
                break;
            }
            System.out.println(transaction.toString());
        }
    }

    public void printStatement() {
        printStatement(10);
    }

    public List<Transaction> getListTransaction() {
        return listTransaction;
    }
}
