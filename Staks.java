import java.util.Scanner;

class Stacks {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stacks(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }
}

class AwesomeStack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стека: ");
        int m = scan.nextInt();
        Stacks mStack = new Stacks(m);
        for(int i = 0; i < m; i++) {
            double n = Math.random();
            n = n * 52;
            int k = (int) Math.round(n);

            mStack.addElement(k);
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int d = scan1.nextInt();
        System.out.print("Стек: ");
        Stacks mStack1 = new Stacks(m);
        Stacks mStack2 = new Stacks(m);
        while (!mStack.isEmpty()) {

            int value = mStack.deleteElement();
            System.out.print(value + " ");


            mStack2.addElement(value);
        }
        while (!mStack2.isEmpty()) {
            int value2 = mStack2.deleteElement();


            mStack1.addElement(value2);
        }
        System.out.println(" ");
        System.out.print( "Новый стек: ");
        while (!mStack1.isEmpty()) {

            int value1 = mStack1.deleteElement();

            double E = (double) value1 / d;
            if (E == (int) E) {
                System.out.print(value1 + " ");
            }
        }
    }
}
