/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
 import java.util.*;
/**
 *
 * @author nilux
 */


class linkedList {
    static class NodeWrapper
    {
        public Node node;
        NodeWrapper(Node node) {
            this.node = node;
        }
    }
    public static Node push(Node head, String data)
    {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
    public static boolean checkPalindrome(NodeWrapper left, Node right)
    {
        if (right == null) {
            return true;
        }
 
        boolean result = checkPalindrome(left, right.next) &&
                            (left.node.data.equals(right.data));
        left.node = left.node.next;
 
        return result;
    }
    public static boolean checkPalin(Node head)
    {
        return checkPalindrome(new NodeWrapper(head), head);
    }
 
    public static void main(String[] args)
    {
         //int[] keys = new int[3];
        Scanner scanner = new Scanner(System.in);
        mylinkedlist myLinkedList = new mylinkedlist();
       // System.out.println("Enter Letters :");
        
       /* int input = 1;
        int number = 1;
        System.out.println ("how many inputs do you want to assign");
        input = scanner.nextInt();
        int[] keys = new int[input];
        for (int i = 0; i < input ; i++) {
            System.out.println ("Number "+number+":- ");
            keys[i] = scanner.nextInt();
           number++;
        } */
        
       System.out.println ("Enter the input");
       
       String  input_1 = scanner.nextLine();
       String[] arr = new String[input_1.length()];
        for (int i = 0; i < input_1.length(); i++) {
           arr[i] = (""+input_1.charAt(i)).trim();
        }
       
        Node head = null;
        for (int i = input_1.length() - 1; i >= 0; i--) {
            
            head = push(head, arr[i]);
        }
 
        if (checkPalin(head)) {
            System.out.println("The linked list is a palindrome");
        }
        else {
            System.out.println("The linked list is not a palindrome");
        }
    }
}

class Node {
	String data;
    Node next = null;
 
    Node(String data) {
        this.data = data;
    }
}
