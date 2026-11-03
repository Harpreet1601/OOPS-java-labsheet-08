import java.time.LocalDate;

public class DateBean {
    // read-only: getter only, no setter
    public LocalDate getCurrentDate() { return LocalDate.now(); }

    public static void main(String[] args) {
        System.out.println("Today: " + new DateBean().getCurrentDate());
    }
}