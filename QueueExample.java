import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExample {
     public static void main(String[] ar)throws Exception{
        Queue<Integer> que= new PriorityQueue<>();
        que.add(12);
        que.add(55);
        que.add(78);
        que.add(87);
        System.out.println(que);

     }
}
