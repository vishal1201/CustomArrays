package in.pelligent;

public class Main {

    public static void main(String[] args) {
        IntegerArray array = new IntegerArray(5);
        array.add(5);
        array.add(21);
        array.add(17);
        System.out.printf("array: %s\n", array);
        array.reverse();
        System.out.printf("array reversed: %s\n", array);
        array.sort(true);
        System.out.printf("array sorted: %s\n", array);
        System.out.println(array);
        System.out.printf("find(21): %d\n", array.find(21));
        System.out.printf("contains(5): %b\n", array.contains(5));
    }
}
