public class Seller implements Observer{

    public boolean update() {
        System.out.println("Wow, Seller! Looks like you got an update");
        return true;
    }
}
