import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int element:arr){
            if(freq.containskey(element)){
                freq.put(element, freq.get(element+1));
            }else{
                freq.put(element,1);
            }
        }
        
        //in order to the find the maximum frequency
        int max = 0;
        for(int freq: freq.values()){
            if(freq>max){
                max = freq;
            }
        }
        
        return max;
    }
}
