/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilux
 */
public class mylinkedlist {
     public Node head;
        public static class Node {

            Node next;
            Object data;
            Node(Object data) {
                this.data = data;
                next = null;
            }
        }
}
