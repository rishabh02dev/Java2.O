public class BinarySearch {

    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //comparisons

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        int key = 3;
        System.out.println("Key is found at the index which is " + binarySearch(numbers, key) );
    }
}
