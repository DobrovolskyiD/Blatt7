import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListStack<E> implements Stack<E>, Iterable<E> {
    private LinkedList<E> list;

    public ListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return list.iterator();
    }
}
