import javax.swing.plaf.synth.SynthStyle;

public class BTree {
    static class Node{
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value= value;
        } 
    }
    public static void main(String[] args) {
        new BTree().run();
    }
    public void run(){
        Node root = new Node(10);
        System.out.println("BTree" + root.value);
        insert(root, 30);
        insert(root, 5);
        insert(root, 25);
        insert(root, 19);
        System.out.println("Traversing Tree preorder");
        printPreOrder(root);
        System.out.println("Traversing Tree Inorder");
        printinOrder(root);
        System.out.println("Traversing Tree Postorder");
        printPostOrder(root);
        
    }
    public void insert(Node node,int value){
        if(value < node.value){
            if(node.left != null){
                insert(node.left, value);
            }else{
                System.out.println("Inserted  " + value +"  to left of  " + node.value);
                node.left = new Node(value);
            }
        }else if (value >= node.value){
            if(node.right != null){
                insert(node.right, value);
            }else{
                System.out.println("Inserted  " + value +"  to right of  " + node.value);
                node.right =new Node(value);
            }
        }
    }
    public void printPreOrder(Node node){
            if(node != null){
            System.out.println(node.value);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
    public void printinOrder(Node node){
            if(node != null){
            printinOrder(node.left);
            System.out.println(node.value);
            printinOrder(node.right);
        }
    
    }
    public void printPostOrder(Node node){
            if(node != null){
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.value);
        }

    }
    

    
}
