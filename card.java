import java.util.*;  
public class Paip {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        ll.add("A");ll.add("1");ll.add("2");ll.add("3");ll.add("4");ll.add("5");ll.add("6");ll.add("7");ll.add("8");ll.add("9");ll.add("10"); 
        ll.add("J");
        ll.add("Q");
        ll.add("K");
        
        System.out.println("Before Shuffle: "+ ll);  
        Collections.shuffle(ll);  
        System.out.println("After Shuffle: "+ll); 
        String first ;String two ;String pfirst ;String ptwo ;
        int f1 ;int t1 ;int pf1 ;int pt1 ;

            System.out.println("**************************************************************************");
            System.out.println("Computer");
            first = ll.poll();
            System.out.print(first+" ");
            if(first.equals("J")||first.equals("Q")||first.equals("K")){
                int sum1 = 0;
                stack.push(String.valueOf(sum1));
            
            }else if(first.equals("A")){
                int sum2 = 1;
                stack.push(String.valueOf(sum2));
            
            }else{;
                int sum2 = Integer.valueOf(first);
                f1 = sum2;
                stack.push(String.valueOf(f1));
            }
            //next>>two
            System.out.print("And");
            two = ll.poll();
            System.out.print(" "+two);
            if(two.equals("J")||two.equals("Q")||two.equals("K")){
                int sum1 = 0;
                stack.push(String.valueOf(sum1));
            
            }else if(two.equals("A")){
                int sum2 = 1;
                stack.push(String.valueOf(sum2));
            
            }else{;
                int sum2 = Integer.valueOf(two);
                t1 = sum2;
                stack.push(String.valueOf(t1));     
            }
            int sum1 = Integer.valueOf(stack.pop());
            int sum2 = Integer.valueOf(stack.pop());
            int pcsum = sum1 + sum2 ;
            if(pcsum >= 10){
                pcsum = pcsum - 10;
            }
            System.out.println("\nScore: "+pcsum);
            
            //next player 
            System.out.println("**************************************************************************");
            System.out.println("Player");
            pfirst = ll.poll();
            System.out.print(pfirst+" ");
            if(pfirst.equals("J")||pfirst.equals("Q")||pfirst.equals("K")){
                int psum1 = 0;
                stack.push(String.valueOf(psum1));
            
            }else if(pfirst.equals("A")){
                int psum2 = 1;
                stack.push(String.valueOf(psum2));
            
            }else{;
                int psum2 = Integer.valueOf(pfirst);
                pf1 = psum2;
                stack.push(String.valueOf(pf1));
            }
            //next>>two
            System.out.print("And");
            ptwo = ll.poll();
            System.out.print(" "+ptwo);
            if(two.equals("J")||ptwo.equals("Q")||ptwo.equals("K")){
                int psum1 = 0;
                stack.push(String.valueOf(psum1));
            
            }else if(ptwo.equals("A")){
                int psum2 = 1;
                stack.push(String.valueOf(psum2));
            
            }else{;
                int psum2 = Integer.valueOf(ptwo);
                pt1 = psum2;
                stack.push(String.valueOf(pt1));     
            }
            int psum1 = Integer.valueOf(stack.pop());
            int psum2 = Integer.valueOf(stack.pop());
            int psum = psum1 + psum2 ;
            if(psum >= 10){
                psum = psum - 10;
            }
            System.out.println("\nScore: "+psum);
            System.out.println("**************************************************************************");
            if(pcsum > psum){
                System.out.println("Computer Win");
            }else if(pcsum < psum){
                System.out.println("Player Win");
            }else{
                System.out.println("Player Draw Computer");
            }
            System.out.println("**************************************************************************");
    }
   
}
