import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final ArrayList<Account> accounts;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        accounts.add(acct);
    }

    public Account getAccount(int account_index) {
        if (account_index >= 0 && account_index < accounts.size()) {
            return accounts.get(account_index);
        }
        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}