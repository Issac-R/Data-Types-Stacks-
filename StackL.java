public class StackL {

    private Node<Integer> Top;
    private int Size;

    public StackL() {
    }

    public StackL(Node<Integer> N) {
        Top = N;
        Size++;
    }

    // Getter
    public int getSize() {
        return Size;
    }

    public void push(Node<Integer> N) {
        if (Top != null) {
            Node<Integer> iter = Top;
            while (iter.getNext() != null) {
                iter = iter.getNext();
            }
            iter.setNext(N);
            Size++;
        } else {
            Top = N;
        }
    }

    public void pop() {
        if (Top == null) {
        } else {
            Node<Integer> iter = Top;
            while (iter.getNext().getNext() != null) {
                iter = iter.getNext();
            }
            iter.setNext(null);
            Size--;
        }
    }

    public Node<Integer> peek() {
        if (Top == null) {
            return null;
        }
        Node<Integer> iter = Top;
        while (iter.getNext() != null) {
            iter = iter.getNext();
        }
        return iter;
    }

    public void clear() {
        Top = null;
        Size = 0;
    }

    public boolean isEmpty() {
        if (Top != null) {
            return false;
        }
        return true;
    }

    public void print() {
        Node<Integer> iter = Top;
        for (int i = 0; i < Size; i++) {
            System.out.println("Stack " + i + ": " + iter.getNum());
            iter = iter.getNext();
        }
    }
}