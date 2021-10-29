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

        System.out.println("******************************************************");

        DoubleArray doubleArray = new DoubleArray(6);
        doubleArray.add(10.25);
        doubleArray.add(8.21);
        doubleArray.add(2.50);
        doubleArray.add(25.00);
        System.out.printf("double array: %s\n", doubleArray);
        doubleArray.reverse();
        System.out.printf("double array reversed: %s\n", doubleArray);
        doubleArray.sort(true);
        System.out.printf("double array sorted: %s\n", doubleArray);
        System.out.println(doubleArray);
        System.out.printf("find(2.50): %d\n", doubleArray.find(2.50));
        System.out.printf("contains(8.21): %b\n", doubleArray.contains(8.21));

    }
}
