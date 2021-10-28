package in.pelligent;

public abstract class Array {
    protected Object[] array;
    protected int lastInsertedIndex;

    public Array(int size) {
        array = new Object[size];
        lastInsertedIndex = -1;
    }

    public int capacity() {
        return array.length;
    }

    public int size() {
        return lastInsertedIndex + 1;
    }

    public abstract boolean update(int index, Object value);

    public abstract void add(Object value);

    public abstract int find(Object value);

    public Object get(int index) {
        return array[index];
    }

    public abstract boolean contains(Object value);

    public abstract void reverse();

    public abstract Array reversed();

    public abstract void sort(boolean order);

    public abstract Array sorted(boolean order);

    public abstract Array copyOf(Array array);

}
