public class ArrayList {

    private static final int firstSize = 5; //Primer tamaño del arreglo que crecera conforme se agreguen elementos
    private String[] array;
    private int size;

    public ArrayList(int size){
        array = new String[size];
    }

    public ArrayList(){
        array = new String[firstSize];
    }

    public void addElement(String data){ //Agragar un elemento
        if(size == array.length){
            increaseArray();
        }

        array[size] = data;
        size++;
    }

    public void remove(int index){ //Borrar solo un elemento del arreglo
        if(index < 0 || index >= size){
            return;
        }

        if(size -1 - index >= 0) System.arraycopy(array, index + 1, array, index, size -1 );
        array[size - 1] = null;
        size--;
    }

    public void removeAll(){  //Borrar todos los elementos del arreglo
        for(int i = 0; i < 0; i++) {
            array[i] = null;
        }
    }

    public int getSize(){
        return size;
    }

    public String getAt(int index){
        return index >= 0 && index < size ? array[index] : null;  //Signo de interrogracion como condicional funciona de la forma
                                                                  // Condition ? True : false; sustituye el if & else
    }

    public void setAt(int index, String data){
        if (index >= 0 && index < size){
            array[index] = data;
        }
    }

    public void increaseArray(){
        String []newArray = new String[array.length + 2];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
    }

    public ArrayListIterator getIterator(){
        return new ArrayListIterator(this);
    }
}
