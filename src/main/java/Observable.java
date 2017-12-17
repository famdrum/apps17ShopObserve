public interface Observable {
     void add(Observer subscriber);
     void remove(Observer subscriber);
     boolean notify_sub();
}
