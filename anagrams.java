import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        int[] c = new int[26];
        int[] d = new int[26];

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }
        
        for(int i = 0 ; i<a.length() ; i++){
            c[a.charAt(i)- 'a']++;
            d[b.charAt(i)- 'a']++;
        }

        for(int i = 0 ; i<a.length() ; i++){
            if(c[i]!=d[i]){
                return false;
            }
        }
        return true;     
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
