package gr.aueb.cf.ch13.bankApp.model;


public class JointAccount {


    private int id;
    private String firstname;
    private String lastname;
    private String account;

    public JointAccount() {
    }

    public JointAccount(int id, String firstname, String lastname, String account) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public  String showAccount() {
        return account;
    }

    public boolean searchAccount (String account) {
        if (this.account.equals(account)){
            showAccount();
            return true;
        }
        return false;
    }


    public String contactToString() {
        return firstname + " , " + lastname +   " , " + account;
    }
}
