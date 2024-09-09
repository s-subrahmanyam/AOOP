// StackImpl.java
import java.util.ArrayList;

public class StackImpl<T> implements GenericStack<T> {
    private ArrayList<T> stackList;

    public StackImpl() {
        stackList = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        stackList.add(item);
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return stackList.remove(stackList.size() - 1);
        }
        return null;  // Return null if stack is empty
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return stackList.get(stackList.size() - 1);
        }
        return null;  // Return null if stack is empty
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}
