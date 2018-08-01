import java.util.List;

public interface Stack<E> {

    E push(E obj);

    E peek();

    E pop();

    boolean isEmpty();

}