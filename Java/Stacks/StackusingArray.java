public class StackusingArray {

    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        // pushing the element into the stack
        void push(int x) {
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        // returning the peek element of the stack
        int peek() {
            if (idx == 0) {
                System.out.print("Stack is empty");
                return -1;
            } 
            return arr[idx - 1];
        }

        // deleting the element in the index

        int pop(){
            if (idx == 0) {
                System.out.print("Stack is Empty");
                return -1;
            }
            else{
                int top = arr[idx-1];
                arr[idx-1] = 0;
                idx--;
                return top;
            }
        }

        void display(){
            for(int i=0; i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
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
