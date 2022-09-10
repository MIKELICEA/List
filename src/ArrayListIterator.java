public class ArrayListIterator {

    private ArrayList array;
    private int cElement;

    public ArrayListIterator(ArrayList array){
        this.array = array;
    }

    public boolean hasNext(){
        return cElement < array.getSize();
    }

    public String next(){
        String data = array.getAt(cElement);
        cElement++;
        return data;
    }
}
