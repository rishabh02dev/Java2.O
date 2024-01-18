public class circularqueue {

    public static class Cqa {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[4];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
                
            } else if (r < arr.length - 1) {
                arr[r + 1] = val;
                r++;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() {

            if (size == 0) {
                System.out.println("Queue is emppty");
                return -1;
            }
            else{
                int val = arr[f];
                if(f==arr.length-1) f =0;
                else f++;
                size--;
                return val;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            } else {
                return arr[f];
            }
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.size);
        q.add(56);

    }
}
