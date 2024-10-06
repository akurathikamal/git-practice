class binaryst{
    class Node{
        int data;
        int height;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
        int getValue(){
             return data;
        }
    }
    static Node root;
    public int height(Node node){
        if(node ==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int data){ 
        root =insert(data,root);
    }
    private Node insert(int data,Node node){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(data<node.data){
            node.left=insert(data,node.left);
        }
        if(data>node.data){
            node.right=insert(data,node.right);
        }
        node.height=Math.max(height(node.right),height(node.left))+1;
        return node;
    }
      boolean balanced(){
        return balanced(root);
     }
     private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return (Math.abs(height(node.right)-height(node.left))<=1 && balanced(node.right) && balanced(node.left));
     }
    public void display(){
        display(root,"Root Node : ");
    }
    private void display(Node node ,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.data);

        display(node.left,"Left child of "+node.data+" : ");
        display(node.right,"Right child of "+node.data+" : ");
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
   public static void main(String[] args){
    binaryst b =new binaryst();
    int [] nums={5,2,7,1,4,6,9,8,3,10};
    b.populate(nums);
    b.display();
   }
}
