package gr.aueb.cf.ch13.bankApp.model;

import java.util.Scanner;

/**
 *
 */
public class OverfraftAccount {

    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String IBAN;
    private double balance;
    private String sSN;

    public OverfraftAccount() {

    }

    public OverfraftAccount(int id, String firstname, String lastname,
                            String username, String IBAN, int balance,
                            String sSN) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.IBAN = IBAN;
        this.balance = balance;
        this.sSN = sSN;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    /**
     * @param amount
     * @param id
     * @throws Exception
     */
    public void deposit (int amount , int id ) throws Exception {

        try {
            if (!isIDCorrect(id)) {
                throw new Exception ("ID is not valid");
            }
            balance = balance + amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     *
     * @param amount
     * @param IBAN
     * @throws Exception
     */
    public void withdraw (int amount , String IBAN) throws Exception{

        try {
            if (!isIBANValid(IBAN)) {
                throw new Exception ("IBAN is not valid");
            }
            if (balance < amount ) {
                throw new Exception(" transaction can be processed");
            }
            balance = balance - amount;
            //System.out.println("your balance " + balance + " is negative");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     *
     * @param IBAN
     * @return
     */
    private boolean isIBANValid (String IBAN) {
        return this.IBAN.equals(IBAN);
    }

    private boolean isIDCorrect (int id) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
         id = sc.nextInt();
         while (id != 0 ) {
             id = id/10;
             count++;
         }
        System.out.println("the number of digits are : " +count);
        System.out.println("ID is valid");
        return true;
    }
}


