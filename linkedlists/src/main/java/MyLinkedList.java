/**
 * Created by User on 16.10.2017.
 */
public class MyLinkedList implements LinkedList {
    public Element head;

    public Element findLast(){
        Element result = head;
        while (result.next != null){
            result = result.next;
        }
        return result;
    }
    public int get(int index) {
        Element current = head;
        int currentIndex = 0;
        while (currentIndex != index){
            currentIndex += 1;
            current = current.next;
        }
        return current.data;
    }

    public void addLast(int newNumber) {
        Element last = findLast();
        Element newElement = new Element(newNumber);
        last.next = newElement;

    }

    public void add(int index, int newNumber) {

    }

    public void remove(int index) {

    }

    public int count() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }
}
