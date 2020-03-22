import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class King {
    public static void main(String[] args) {
        Deque deque = new LinkedList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size Deque: ");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            double n = Math.random();
            n = n * 52;
            int k = (int) Math.round(n);
            deque.add(k);
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter number which will add to the deque: ");
        int b = scan1.nextInt();
        deque.addLast(b);
        deque.addLast(0);
        for (Object s : deque) {
            System.out.println(s);
        }
    }
}
