public class BS{
    public static void main(String[] args) {
        int[] arr = {1,2,4,55,66,78};
        int target = 55;
        System.out.println(search(arr,target,0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, mid+1, e);
        }
        else{
            return search(arr, target, mid-1, e);
        }
    }
    
}