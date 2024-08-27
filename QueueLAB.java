import java.util.*;
public class QueueLAB {
 
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        while(true){
        for(int a = 0; a < 21; a++){
            queue.add(a);
            System.out.println(queue);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

        }
        for(int a = 20; a > -1; a = a-1){
            queue.remove(a);
            System.out.println(queue);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

        }
    }
     }
}