import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private double balance;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public double getBalance() { return balance; }

    public void setBalance(double newBalance) {
        double old = balance;
        balance = newBalance;
        support.firePropertyChange("balance", old, newBalance);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) { support.addPropertyChangeListener(l); }
    public void removePropertyChangeListener(PropertyChangeListener l) { support.removePropertyChangeListener(l); }

    public static void main(String[] args) {
        AccountBean acc = new AccountBean();
        acc.addPropertyChangeListener(e ->
            System.out.println("Balance changed: " + e.getOldValue() + " -> " + e.getNewValue()));
        acc.setBalance(500);
    }
}