import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Royal1 {
    static Queue<String> queue7(Queue<String> source, Queue<String> target) {
        if ( ! source.isEmpty() ) {
            String element = source.poll();
            queue7(source, target);
            target.add(element);
        }
        return target;
    }

    static Queue<String> queue7(Queue<String> source) {
        Queue<String> target = new LinkedList<>();
        return queue7(source, target);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер очереди: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            int b = sc1.nextInt();
            q.offer(b);
        }
        Queue<String> result = new LinkedList();
        System.out.println("Новая очередь: ");
        while (!result.isEmpty())
            System.out.print(result.poll() + " ");
        System.out.println();
    }
}