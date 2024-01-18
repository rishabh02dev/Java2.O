import java.util.Queue;

public class ArrayImplementation {

    public static class queueA{
        int f = -1;
        int r = -1;
        int[] arr = new int[100];
        int size = 0;

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]= val;
            }
            else{
                arr[r+1] = val;
                r++;
            }
            size++;
        }

        public int remove(){

            if(size==0){
                System.out.println("Queue is emppty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
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
                System.out.println("Queue is zero");
            }
            else{
                for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        
    }
}
