public class linearSearch {
    public static int linearSearch(int marks[] , int key){
            for(int i = 0; i<marks.length; i++){
                if(marks[i] == key){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int marks[] = {34,45,67,78,99};
        int key = 45;

        int index = linearSearch(marks, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at Index : " + index);
        }
    }
}
