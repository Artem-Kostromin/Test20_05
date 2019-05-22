public class CustomArrayList implements CustomList {

    private final int START_LENGTH = 10;
    private Object[] arForCustomArList = new Object[START_LENGTH];
    private int size = START_LENGTH;
    private int ind = 0;


    @Override
    public Object get(int index) {
        if (index > ind) throw new ArrayIndexOutOfBoundsException();
        return arForCustomArList[index];
    }

    @Override
    public void add(Object object) {
        if (ind == size) increaseLength();
        arForCustomArList[ind] = object;
        ind++;
    }

    @Override
    public void add(int index, Object object) {
        if (index > ind) throw new ArrayIndexOutOfBoundsException();

        if (ind < size-1) insertNewNum(index, object);
        else {
            increaseLength();
            insertNewNum(index,object);
        }

    }

    private void increaseLength () {
        size = size * 2;
        Object[] supAr = new Object[size];
        for (int i = 0; i < arForCustomArList.length - 1; i++) {
            supAr[i] = arForCustomArList[i];
        }
        arForCustomArList = supAr;
    }

    private void insertNewNum ( int index, Object object){
        Object[] supAr = new Object[size];
        for (int i = 0; i < index; i++) {
            supAr[i] = arForCustomArList[i];
        }
        supAr[index] = object;
        for (int j = index + 1; j < size; j++) {
            supAr[j] = arForCustomArList[j];
        }
        arForCustomArList = supAr;
    }

    public int size(){
        return size;
    }

}
