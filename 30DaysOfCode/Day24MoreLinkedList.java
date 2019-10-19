import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }	
}

class Solution {
    
    /**
    * Remove duplicate data from LinkedList
    */
    public static Node removeDuplicates(Node head) {        
        Node current = head;
        while(current != null) {
            Node temp = current;
            while(temp != null && current.data == temp.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }    
        return head;
    }
    
    /**
    * Insert data (Node) into LinkedList
    */
    public static  Node insert(Node head,int data) {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    
    /**
    * Display data in LinkedList
    */
    public static void display(Node head){
        Node start=head;
        while(start!=null) {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    
    /**
    * Main Method
    */
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0) {
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
