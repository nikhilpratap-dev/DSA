class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        int[] ranarr = new int[26];
        int[] magarr = new int[26];
        
        for(int i=0; i<ransomNote.length(); i++){
            ranarr[ransomNote.charAt(i) - 'a'] += 1;
        }
         for(int i=0; i<magazine.length(); i++){
            magarr[magazine.charAt(i) - 'a'] += 1;
        }
        boolean result = true;
        for(int i=0; i<26; i++){
            if(ranarr[i] > magarr[i]){
                result = false;
                break;
            }
        }
        return result;

    }
}