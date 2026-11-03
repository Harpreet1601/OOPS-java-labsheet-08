public class AccountDemo {
    public static void main(String[] args) {
        AccountBean acc = new AccountBean();
        acc.addPropertyChangeListener(e ->
            System.out.println("Event fired: balance " + e.getOldValue() + " -> " + e.getNewValue()));

        acc.setBalance(1000);
        acc.setBalance(1500);
        acc.setBalance(700);
    }
}