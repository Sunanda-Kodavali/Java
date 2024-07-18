package dci.j24e01;

import java.util.ArrayList;
import java.util.List;

public class WalletStorage {

    private static WalletStorage instance;

    public synchronized static WalletStorage sharedInstance() {
        if (instance == null) {
            instance = new WalletStorage();
        }
        return instance;
    }

    private final Profile profile;
    private final List<Transaction> transactionList;

    private WalletStorage() {
        this.profile = new Profile();
        this.transactionList = new ArrayList<>();
    }

    public Profile getProfile() {
        return profile;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

}