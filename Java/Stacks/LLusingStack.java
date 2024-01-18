public class LLusingStack {

    public static class Node{//user defined datatype
        int val;
        Node next;


        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack{ //user defined data structure
        private Node head = null;
        private int size = 0;
        
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(Node h){
            if(h==null) return ;
            displayrec(h.next);
            System.out.println(h.val+ " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty!!");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }


        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.val;
        }

        boolean isEmpty(){
            if(size==0){
                return true;
            }
            else{
                return false;
            }
        }
    }


    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);   
        st.push(2);     
        st.push(3);     
        st.push(4);
        System.out.println(st.size()); //4
        st.display();
        st.pop(); 
        st.display(); //123
        st.peek(); //3
        
        
    }
}
