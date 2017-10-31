/**
 * Created by User on 16.10.2017.
 */
public class Element {
    Element next;
    int data;

    public Element(int newData){
        data = newData;
    }

    @Override
    public String toString() {
        return "Element{data="+ data +'}';
    }
}
