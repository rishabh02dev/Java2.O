import java.util.Stack;

public class reversestackusingrecursion {

    // This prints this in the reverse order
    // public static void displayst(Stack<Integer> st){
    // if(st.size()==0){
    // return;
    // }

    // int top = st.pop();
    // System.out.print(top+" ");
    // displayst(st);
    // st.push(top);
    // }

    //jab yaha top ko pop or print simultaneously

    // This prints in the normal order
    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }

        int top = st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    //is case mai phle pop to kar rahe hai par print nahi kar rahe fhir jab mai last 1 bachega uske sath print krte huye lagenge backtracking use hogii

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRec(st);
    }
}
