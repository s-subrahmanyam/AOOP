// ArrayOperations.java
public class ArrayOperations<T extends Comparable<T>> implements MinMax<T> {
    T[] arr;

    public ArrayOperations(T[] arr) {
        this.arr = arr;
    }

    @Override
    public T min() {
        T minValue = arr[0];
        for (T element : arr) {
            if (element.compareTo(minValue) < 0) {
                minValue = element;
            }
        }
        return minValue;
    }

    @Override
    public T max() {
        T maxValue = arr[0];
        for (T element : arr) {
            if (element.compareTo(maxValue) > 0) {
                maxValue = element;
            }
        }
        return maxValue;
    }
}
