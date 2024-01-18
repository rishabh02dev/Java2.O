import java.util.Stack;

public class deleteatindex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        


        int[] arr =  new int[4];
        for(int i=3; i>=0; i--){
            arr[i] = st.pop();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

        System.out.println(st);
    }

}
