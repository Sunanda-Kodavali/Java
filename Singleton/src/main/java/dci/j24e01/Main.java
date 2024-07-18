package dci.j24e01;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Joe", LocalDate.now(), "London");
        Person p2 = new Person("Jack", LocalDate.now(), "London");
        Person p3 = new Person("Joanne", LocalDate.now(), "London");


        PersonManager pm = PersonManager.sharedInstance();
        PersonManager pm2 = PersonManager.sharedInstance();
        PersonManager pm3 = PersonManager.sharedInstance();
        PersonManager pm4 = PersonManager.sharedInstance();


        WalletStorage walletStorage1 = WalletStorage.sharedInstance();
        WalletStorage walletStorage2 = WalletStorage.sharedInstance();


        walletStorage1.getTransactionList().add(new Transaction());
        walletStorage2.getTransactionList();
    }
}