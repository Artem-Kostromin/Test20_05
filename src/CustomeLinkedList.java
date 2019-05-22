public class CustomeLinkedList implements CustomList {
    private Node  first;
    private  Node last;
    private int size = 0;

    private static class Node {
        Object data;
        Node next;
        Node previous;

        public Node(Object data) {
            this.data = data;
        }
    }

    @Override
    public Object get(int index) {
        if(index>=size || index<0) throw new IndexOutOfBoundsException();
        Node supNode = first;
        for(int i=0;i<index;i++){
            supNode = supNode.next;
        }
        return supNode.data;
    }

    @Override
    public void add(Object object) {
        Node newNode = new Node(object);
        if(first==null){
            newNode.previous = null;
            newNode.next = null;
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            newNode.previous = last;
            newNode.next = null;
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, Object object) {
        if(index>size || index<0) throw new IndexOutOfBoundsException();
        Node newNode = new Node(object);
        if(index==size){
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        Node supNode = first;
        for(int i=0;i<index;i++){
            supNode = supNode.next;
        }
        Node oldPrevious = supNode.previous;
        oldPrevious.next = newNode;
        supNode.previous = newNode;

        newNode.previous = oldPrevious;
        newNode.next = supNode;
        size++;
    }
    public int size(){
        return size;
    }

}
