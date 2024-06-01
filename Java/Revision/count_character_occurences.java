public class count_character_occurences {
    public static void main(String[] args) {
        int hash[] = new int[26];
        String s = "abcda";
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)- 'a']++;
            //This is the pre computation part
        }
        
        //now we do the fetching part
        for(int i=0; i<hash.length;i++){
            System.out.println(hash[i]);
        }
    }
}
