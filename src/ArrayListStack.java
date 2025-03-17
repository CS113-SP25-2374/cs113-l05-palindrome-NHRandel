import java.util.ArrayList;

public class ArrayListStack<E> implements StackInterface<E> {
    private ArrayList<E> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public E push(E obj) {
        stack.add(obj);
        return obj;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
