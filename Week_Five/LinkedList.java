public class LinkedList{
    public static class Node{
    int data;
    Node next;



    Node(int data){
        this.data=data;
        this.next=null;
    }    
    }
    public static void main(String args[]){
        Node a= new Node(5);
        System.out.println("address of a : "+a);
        System.out.println(a.next);


        Node b= new Node(6);
        System.out.println("address of b:"+b);
        System.out.println(b.next);
    }
}