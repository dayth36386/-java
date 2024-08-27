import java.util.*;
public class postfixtosum {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("How many characters ?: ");
        int in = Keyboard.nextInt();
        int i = 0;

            while(i < in){
                i++;
                System.out.print("Enter character: ");
                String asum = Keyboard.next();
                if(asum.equals("^")|| asum.equals("*")||asum.equals("/")||asum.equals("+")||asum.equals("-")){
                    int sum1 = Integer.valueOf(stack.pop());
                    int sum2 = Integer.valueOf(stack.pop());
                    if(asum.equals("+")){
                        System.out.println("infix :"+sum1+ "+" +sum2); 
                        int sum = sum1 + sum2 ;
                        stack.push(String.valueOf(sum));
                    }
                    else if(asum.equals("-")){
                        System.out.println("infix :"+sum1+ "-" +sum2);  
                        int sum = sum1 - sum2 ;
                        stack.push(String.valueOf(sum));
                    }
                    else if(asum.equals("*")){
                        System.out.println("infix :"+sum1+ "*" +sum2);  
                        int sum = sum1 * sum2 ;
                        stack.push(String.valueOf(sum));
                    }
                    else if(asum.equals("/")){
                        System.out.println("infix :"+sum1+ "/" +sum2);  
                        int sum = sum1 / sum2 ;
                        stack.push(String.valueOf(sum));
                    }
                    else if(asum.equals("^")){
                        System.out.println("infix :"+sum1+ "^" +sum2);  
                        int sum = sum1 ^ sum2 ;
                        stack.push(String.valueOf(sum));
                    }
                }else{
                    stack.push(asum);

                }  
            }
            System.out.println("Result :"+ stack);
    }
}
