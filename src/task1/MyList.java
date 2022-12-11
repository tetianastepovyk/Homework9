package task1;

public interface MyList<T> {
    void add(T item);
    void remove(int index);
    int size();
    void clear();
    T get(int index);
}
