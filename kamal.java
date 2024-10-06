import java.util.Scanner;
class kamal{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    void populate(Scanner sc){
        System.out.println("enter the root node : ");
        int val =sc.nextInt();
        root =new Node(val);
        populate(sc,root);
    }
    void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter the left side value of "+node.data);
        Boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the left side value of "+node.data);
            int val =sc.nextInt();
            node.left=new Node(val);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter the right side value of the "+node.data);
        Boolean right =sc.nextBoolean();
        if(right){
            System.out.println("enter the right side value of "+node.data);
            int val =sc.nextInt();
            root.right=new Node(val);
            populate(sc,root.right);
        }
    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null){
            return ;
        }
        System.out.println(node.data+" ");
        display(node.left);
        display(node.right);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        kamal k =new kamal();
        k.populate(sc);
        k.display();
    }
}