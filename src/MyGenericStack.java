import java.util.EmptyStackException;
import java.util.LinkedList;

//  Tao lop MyGenericStack voi cac thuoc tinh
public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    //  Cai dat phuong thuc push()
    public void push(T element) {
        stack.addFirst(element);
    }

    //  Cai dat phuong thuc pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    //  Cai dat phuong thuc size()
    public int size() {
        return stack.size();
    }

    //  Cai dat phuong thuc isEmpty()
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
