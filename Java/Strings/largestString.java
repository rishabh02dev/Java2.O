public class largestString {
    public static void main(String[] args) {
        String frruits[] = {"apple", "mango", "banana"};
        String largest = frruits[0];

        for(int i =1; i<frruits.length;i++){
            if(largest.compareTo(frruits[i])<0){
                largest = frruits[i];
            }
        }
        System.out.println(largest);
    }
}
