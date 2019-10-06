import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    //Class Provided by HackerRank
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    
    //Class Provided by HackerRank
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }      
    }
    
    //Provided by HackerRank
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    
    /**
    * Implemented to insert element at tail of LinkedList    
    */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        //Store the head
        SinglyLinkedListNode temp = head; 
        
        //return new if head is null (Important****)
        if(head == null) {
            return new SinglyLinkedListNode(data);
        }
        
        //Loop till end of LinkedList
        while ((head.next != null)) {
            head = head.next;
        }
        //Asign new value to head
        head.next = new SinglyLinkedListNode(data);

        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);
