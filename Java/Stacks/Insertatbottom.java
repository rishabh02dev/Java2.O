import java.util.Stack;

public class Insertatbottom {
    public static void main(String[] args) {
        Stack<Integer> st =  new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        int id = 2;
        int element = 100;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>id){
            rt.push(st.pop());
        }
        rt.push(element);

        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
