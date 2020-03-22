
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Royal {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size queue: ");
        int a = sc.nextInt();
            for (int i=0; i<a; i++) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter queue element #"+(i+1)+": ");
                int b = sc1.nextInt();
                queue.offer(b);
            }
        Stack stack = new Stack();
            Stack stack1=new Stack();
            for (int k=0; k<a ; k++) {
                Object s1 = queue.poll();
                stack.push(s1);
            }

            for (int e=0;e<a;e++){
                Object s2 = stack.pop();
                queue.add(s2);
            }
         for(Object s : queue) {
             System.out.println("q"+s);
         }






    }
}
