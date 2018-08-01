import java.util.NoSuchElementException;

public class LinkedList<E> implements Stack<E> {

    private Node<E> top;
    private int size = 0;

    @Override
    public E push(final E obj) {

        top = new Node<>(obj, top);
        return obj;
    }

    @Override
    public E peek() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return top.data;
        }
    }

    @Override
    public E pop() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            E result = top.data;
            top = top.next;
            return result;
        }
    }

    @Override
    public boolean isEmpty() {

        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

}