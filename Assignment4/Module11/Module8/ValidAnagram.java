package Assignment.Ass1and2.Assignment4.Module8;

//LeetCode 242 – Valid Anagram
 public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
     if(s.length() != t.length()) {
        return false;
    }

    int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

        for(int c : count){
        if(c != 0){
            return false;
        }
    }

        return true;
}
}
