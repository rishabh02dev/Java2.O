import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(1);
        st.push(244);
        st.push(122);
        st.push(13);
        
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //yeah output ke operations ko print karke degaa
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);
        
    }
}
