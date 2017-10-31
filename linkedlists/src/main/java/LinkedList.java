/**
 * Created by User on 16.10.2017.
 */
public interface LinkedList {
    int get(int index);
    void addLast(int newNumber);
    void add(int index, int newNumber);
    void remove(int index);
    int count();
    boolean isEmpty();
}
