public class findingtheelement {
    public static void main(String[] args) {
        int arr[]  = {2,4,5,6,7,8};
        System.out.println(element(arr, 7, 0));
    }

    static boolean element(int arr[], int target, int index){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || element(arr, target, index+1);
    }
}
