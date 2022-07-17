
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilux
 */
public class ReverseLinkedList {
  
         public static void main(String[] args) {
            int[] arr = new int[3];

            Scanner scanner = new Scanner(System.in);
            mylinkedlist myLinkedList = new mylinkedlist();
            System.out.println("Enter Numbers :");
            for(int i = 0; i<3 ;i++)
            {
                arr[i] = scanner.nextInt();
            }
            myLinkedList.head = new mylinkedlist.Node(arr[0]);
            myLinkedList.head.next = new mylinkedlist.Node(arr[1]);
            myLinkedList.head.next.next = new mylinkedlist.Node(arr[2]);
            printLinkedList(myLinkedList);
            reverseLinkedList(myLinkedList);
            printLinkedList(myLinkedList);

        }
        public static void printLinkedList(mylinkedlist linkedList) {
            mylinkedlist.Node h = linkedList.head;
            while (linkedList.head != null) {
                System.out.print(linkedList.head.data + " ");
                linkedList.head = linkedList.head.next;
            }
            System.out.println();
            linkedList.head = h;
        }
        public static void reverseLinkedList(mylinkedlist linkedList) {
            mylinkedlist.Node previous = null;
            mylinkedlist.Node current = linkedList.head;
            mylinkedlist.Node next;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            linkedList.head = previous;
        }
    }
