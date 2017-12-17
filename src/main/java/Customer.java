public class Customer implements Observer {
    public boolean update() {
        System.out.println("Wow, Customer! Looks like you got an update");
        return true;
    }
}
