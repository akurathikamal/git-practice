class linked{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    void insertAtEnd(int data){
        Node node =new Node(data);
     if(head==null){
        head=node;
     }
     else{
        Node n =head;
        while(n.next!=null){
         n=n.next;
        }
        n.next=node;
     }
    }
    void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    int size(){
        Node n1=head;
        int a=0;
        while(n1!=null){
            a++;
            n1=n1.next;
        }
        return a;
    }
    
    public void reverse(){
        Node present =head;
        Node n =present.next;
        Node pre =null;
        while(present!=null){
            present.next=pre;
            pre=present;
            present=n;
            if(n!=null)
            n=n.next;
            
        }
        
        head=pre;
    }

    public static void main(String[] args){
     linked link =new linked();
     link.insertAtEnd(10);
     link.insertAtEnd(20);
     link.insertAtEnd(30);
     link.insertAtEnd(40);
     link.insertAtEnd(50);
     link.insertAtEnd(60);
     link.reverse();
     link.display();
     System.out.println(link.size());
    
    }
}