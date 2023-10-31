public class bubbleSort{
    static void bubble_Sort(int[] arr, int n){
        for(int i = n-1; i>=0; i--){
            int didSwap = 0;
            for(int j =0; j<=i-1;j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            System.out.println("Runs");
            if(didSwap ==0){
                break;
            }

        }

        System.out.println("After bubble Sort: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12,23,1,2};
        int n = arr.length;

        System.out.println("Before using bubble sort");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_Sort(arr, n);
    }
    
}