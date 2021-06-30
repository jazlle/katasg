import java.math.BigDecimal;
import java.util.*;

public class Statement {

    private Set<Transaction> listTransaction;

    public Statement() {
        listTransaction = new TreeSet<>(transactionComparator);
    }

    public void addTransaction(Date date, BigDecimal amount, BigDecimal balance) {
        Transaction newTransaction = new Transaction(date, amount, balance);
        listTransaction.add(newTransaction);
    }

    public void printStatement() {
        for(Transaction transaction: listTransaction){
            //TODO: override toString
            System.out.println(transaction.toString());
        }
    }

    private static final Comparator<Transaction> transactionComparator = new Comparator<Transaction>() {
        public int compare(Transaction transaction1, Transaction transaction2) {
            return transaction1.getDate().compareTo(transaction2.getDate());
        }
    };

    public Set<Transaction> getListTransaction() {
        return listTransaction;
    }
}
