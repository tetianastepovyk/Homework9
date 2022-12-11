package task1;

public class MyLinkedList<T> implements MyList<T>{
    transient int modCount=0;
    transient int size = 0;

    /**
     * Pointer to first node.
     */
    transient Node<T> first;

    /**
     * Pointer to last node.
     */
    transient Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    @Override
    public void add(T item){
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, item, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        //modCount++;
    }
    @Override
    public void remove(int index){
        checkElementIndex(index);
        T element1 = unlink(node(index));
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    Node<T> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    T unlink(Node<T> x) {
        // assert x != null;
        final T element = x.item;
        final Node<T> next = x.next;
        final Node<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void clear(){
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    @Override
    public T get(int index){
        checkElementIndex(index);
        return node(index).item;
    }
}
