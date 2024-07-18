package dci.j24e01;

public class PersonManager {

    private static PersonManager instance;

    private PersonManager() {
    }

    public synchronized static PersonManager sharedInstance() {
        if (instance == null) {
            instance = new PersonManager();
        }
        return instance;
    }

}