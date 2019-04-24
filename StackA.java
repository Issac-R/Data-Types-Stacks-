public class StackA {
    private int[] Array;
    private int Size;

    public StackA(int Size) {
        this.Size = Size;
        this.Array = new int[Size];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = -999;
        }
    }

    // Getters
    public int getSize() {
        return Size;
    }

    // Stack Methods
    public void push(int num) {
        int i = 0;
        while (Array[i] != -999) {
            i++;
        }
        Array[i] = num;
    }

    public void pop() {
        if (Array[0] == -999) {
        } else {
            if (isFull()) {
                Array[Array.length - 1] = -999;
            } else {
                int i = 0;
                while (Array[i] != -999) {
                    i++;
                }
                Array[i - 1] = -999;
            }
        }
    }

    public int peek() {
        if (Array[0] == -999) {
            return -999;
        }
        int i = 0;
        while (Array[i] != -999) {
            i++;
        }
        return Array[i - 1];
    }

    public void clear() {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != -999) {
                Array[i] = -999;
            }
        }
    }

    public boolean isEmpty() {
        if (Array[0] != -999) {
            return true;
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == -999) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Stack " + i + ": " + Array[i]);
        }
        System.out.println();
    }
}