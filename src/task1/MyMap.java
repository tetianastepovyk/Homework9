package task1;

public interface MyMap<K,V> {
    /*put(Object key, Object value) додає пару ключ + значення*/
    V put(K key, V value);

    //remove(Object key) видаляє пару за ключем
    V remove(Object key);

    //clear() очищає колекцію
    void clear();

   // size() повертає розмір колекції
    int size();

    //get(Object key) повертає значення (Object value) за ключем
    V get(Object key);
}
