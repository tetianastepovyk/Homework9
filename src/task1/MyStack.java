package task1;

public class MyStack<T> implements MyList<T>, MyListPeekPoll<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    /*
    Добавляет новый элемент в список. При достижении размера внутреннего
    массива происходит его увеличение в два раза.
    */
    @Override
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    /*
    Возвращает элемент списка по индексу.
    */
    @Override
    public T get(int index) {
        return (T) array[index];
    }

    /*
    Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    перемещаются на шаг налево. Если после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.
    */
    @Override
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
    }
    /*Возвращает количество элементов в списке*/
    @Override
    public int size() {
        return pointer;
    }
    //повертає перший елемент стеку
    @Override
    public T peek(){
        if (size()==0)
            return null;//System.exit(-1);
        return (T) array[size()-1];
    }
    // повертає перший елемент стеку та видаляє його з колекції
    public T pop(){
        if (size()==0)
            return null;
        T value= (T) array[size()-1];
        remove(size()-1);
        return value;
    }
    /*Вспомогательный метод для масштабирования.*/
    @Override
    public void clear() {
        for (int i = 0; i<=pointer; i++)
            array[pointer] = null;
        pointer = 0;
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
