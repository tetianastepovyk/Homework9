package task1;

public class MyHashMap<K,V> implements MyMap<K,V>{

    private int size;
    private Node<K, V> current;
    /*put(Object key, Object value) додає пару ключ + значення*/
    @Override
    public void put(K key, V value){
        if (size == 0) {
            current = new Node<>(key, value, null);
            size++;
        } else {
            Node<K, V> temp = current;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next = new Node<>(key, value, null);
            size++;
        }
    }

    //remove(Object key) видаляє пару за ключем
    @Override
    public void remove(Object key){
        Node<K, V> prev = null;
        Node<K, V> temp = current;

        for (int i = 0; i < size; i++) {
            if (temp.key == key && i == 0) {
                current = temp.next;
                size--;
                return;
            } else {
                if (temp.key == key) {
                    prev.next = temp.next;
                    size--;
                    return;
                } else {
                    prev = temp;
                    temp = temp.next;
                }
            }
        }
    }

    //clear() очищає колекцію
    @Override
    public void clear(){
        size = 0;
        current = null;
    }

    // size() повертає розмір колекції
    @Override
    public int size(){
        return size;
    }

    //get(Object key) повертає значення (Object value) за ключем
    @Override
    public V get(Object key){
        Node<K, V> tempNode = current;

        for (int i = 0; i < size; i++) {
            if (tempNode.key == key) {
                return tempNode.value;
            } else {
                tempNode = tempNode.next;
            }
        }
        return tempNode.value;
    }

    static class Node<K, V> {
        private K key;
        private V value;

        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
