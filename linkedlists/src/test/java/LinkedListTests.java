import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by User on 16.10.2017.
 */
public class LinkedListTests {
    @Test
    public void addLastTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(42);
        int actual = list.get(0);
        int expected = 42;

        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(1); //0
        list.addLast(2); //1
        list.addLast(3); //2
        list.addLast(4); //3
        list.addLast(5); //4
        list.remove(2);
        int actual = list.get(2);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        LinkedList list = new MyLinkedList();
        boolean actual = list.isEmpty();
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void isNotEmptyTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(38);
        boolean actual = list.isEmpty();
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void countTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(38);
        list.addLast(3);
        list.addLast(15);
        int actual = list.count();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void emptyListCountTest(){
        LinkedList list = new MyLinkedList();
        int actual = list.count();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        int actual = list.get(3);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        LinkedList list = new MyLinkedList();
        list.addLast(1); //index 0
        list.addLast(2); //index 1
        list.addLast(3); //index 2
        list.addLast(4); //index 3
        list.addLast(5); //index 4
        list.add(2, 100500);
        int actual = list.get(2);
        int expected = 100500;

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenEmpty(){
        LinkedList list = new MyLinkedList();
        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeFirst(){
        LinkedList list = new MyLinkedList();
        list.addLast(111);
        list.remove(0);
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeOutOfRange(){
        LinkedList list = new MyLinkedList();
        list.addLast(123);
        list.remove(100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addOutOfRange(){
        LinkedList list = new MyLinkedList();
        list.add(100, 1);
    }

    @Test
    public void addFirst(){
        LinkedList list = new MyLinkedList();
        list.addLast(42);
        list.add(0, 111);

        int actual = list.get(0);
        int expected = 111;

        assertEquals(expected, actual);
    }
}
