package in.pelligent;

public class DoubleArray extends Array {

    public DoubleArray(int size) {
        super(size);
    }

    @Override
    public boolean update(int index, Object value) {
        if (index < 0 || index >= array.length)
            return false;

        array[index] = value;
        return true;
    }

    @Override
    public void add(Object value) {
        if (lastInsertedIndex + 1 < array.length) {
            array[++lastInsertedIndex] = value;
        }
    }

    @Override
    public int find(Object value) {
        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] == (double) value)
                return i;
        }

        return -1;
    }

    @Override
    public boolean contains(Object value) {
        return find(value) != -1;
    }

    @Override
    public void reverse() {
        array = reversed().array;
    }

    @Override
    public Array reversed() {
        Array newArray = new DoubleArray(array.length);
        for (int i = 0; i <= lastInsertedIndex; i++) {
            newArray.add(array[lastInsertedIndex - i]);
        }

        return newArray;
    }

    @Override
    public void sort(boolean asc) {
        array = sorted(asc).array;
    }

    @Override
    public Array sorted(boolean asc) {

        Array sortedArray = copyOf(this);
        boolean moved = true;
        while (moved) {
            moved = false;
            for (int i = 0; i < sortedArray.size() - 1; i++) {
                boolean condition;
                if (asc)
                    condition = (double) sortedArray.array[i] > (double) sortedArray.array[i + 1];
                else
                    condition = (double) sortedArray.array[i] < (double) sortedArray.array[i + 1];

                if (condition) {
                    sortedArray.array[i] = (double) sortedArray.array[i] + (double) sortedArray.array[i + 1];
                    sortedArray.array[i + 1] = (double) sortedArray.array[i] - (double) sortedArray.array[i + 1];
                    sortedArray.array[i] = (double) sortedArray.array[i] - (double) sortedArray.array[i + 1];
                    moved = true;
                }
            }
        }

        return sortedArray;
    }

    @Override
    public Array copyOf(Array array) {
        Array copy = new DoubleArray(array.capacity());
        for (int i = 0; i < array.size(); i++) {
            copy.add(array.get(i));
        }

        return copy;
    }

    @Override
    public String toString() {
        StringBuilder stringifier = new StringBuilder("Array: {");
        for (int i = 0; i <= lastInsertedIndex; i++) {
            stringifier.append(String.format("%s,", array[i]));
        }
        if (",".equals(Character.toString(stringifier.charAt(stringifier.length() - 1))))
            stringifier.deleteCharAt(stringifier.length() - 1);
        stringifier.append("}");
        return stringifier.toString();
    }
}
