import java.util.ArrayDeque;
import java.util.Queue;

import javax.management.Query;

public class ImplementaationLL {

    public static class Node{ //user defined data type
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{

        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            else{
                return false;
            }
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        queueLL q1 = new queueLL();
        q1.add(1);
        q1.add(2);
        q1.add(23);
        q1.add(24);
        q1.add(25);
        q1.display();
        System.out.println(q1.peek()); 

    }


}
