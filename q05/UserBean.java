public class UserBean {
    private String password;

    // write-only: setter only, no getter
    public void setPassword(String password) { this.password = password; }

    public boolean checkPassword(String attempt) {
        return password != null && password.equals(attempt);
    }

    public static void main(String[] args) {
        UserBean u = new UserBean();
        u.setPassword("secret123");
        System.out.println("Correct? " + u.checkPassword("secret123"));
    }
}