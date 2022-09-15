package Week11;

public class AccountHolder {
    private String userName;
    private String password;
    private String email;
    private static int amount;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        AccountHolder.amount = amount;
    }
}
