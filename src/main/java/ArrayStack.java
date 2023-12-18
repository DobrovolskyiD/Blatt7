import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayStack<E> implements Stack<E> {
    private static final int DEFAULT_CAPACITY = 1;
    private static final double GROWTH_FACTOR = 2.0;
    private static final double SHRINK_THRESHOLD = 0.4;

    private Object[] array;
    private int capacity;
    private int size;

    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }

    @Override
    public void push(E element) {
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = getElement(size - 1);
        size--;
        shrinkIfNeeded();
        return element;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return getElement(size - 1);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private E getElement(int index) {
        @SuppressWarnings("unchecked")
        E element = (E) array[index];
        return element;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            int newCapacity = (int) (capacity * GROWTH_FACTOR);
            array = Arrays.copyOf(array, newCapacity);
            capacity = newCapacity;
        }
    }

    private void shrinkIfNeeded() {
        if (size < capacity * SHRINK_THRESHOLD && capacity > DEFAULT_CAPACITY) {
            int newCapacity = Math.max(DEFAULT_CAPACITY, (int) (capacity / GROWTH_FACTOR));
            array = Arrays.copyOf(array, newCapacity);
            capacity = newCapacity;
        }
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

