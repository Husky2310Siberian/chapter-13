package gr.aueb.cf.ch13.bankApp;

import gr.aueb.cf.ch13.bankApp.model.JointAccount;
import gr.aueb.cf.ch13.bankApp.model.OverfraftAccount;

public class MainExercise {

    public static void main(String[] args) {


        OverfraftAccount alice = new OverfraftAccount(1, "Alice", "W.",
                "alice1990", "135790", 1000, "987654321");

        JointAccount bob = new JointAccount(1, "bob" , "kr" , "123456789");
        JointAccount maria = new JointAccount(2,"maria " , "kr" , "123456789");


        System.out.println(bob.contactToString());
        System.out.println(bob.showAccount());
        System.out.println(bob.showAccount().equals("12345678") +maria.showAccount());


        System.out.println("please insert the id client");

        try {
            alice.deposit(1000, 1);
            alice.withdraw(500,"135790");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(alice.getBalance());

    }
}