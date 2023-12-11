class Solution {
    public String sortVowels(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
    StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            //lower
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                lower[s.charAt(i)-'a']++;
                sb.setCharAt(i, '#');

            }
            //upper 
            else if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                upper[s.charAt(i)-'A']++;
                sb.setCharAt(i, '#');
            }
        }//end of for loop
        StringBuilder ans = new StringBuilder();
        //upper
        for(int i=0; i<26; i++){
            char c = (char) ('A'+i);
            while(upper[i]>0){
                ans.append(c);
                upper[i]--;
            }
        }
        //lower
        for(int i=0; i<26; i++){
            char c = (char) ('a'+i);
            while(lower[i]>0){
                ans.append(c);
                lower[i]--;
            }
        }

        int first=0,second=0;//second is pointing vowel and first is indicating original string for traversing
        while(second<ans.length()){
            if(sb.charAt(first)=='#'){
                sb.setCharAt(first,ans.charAt(second));
                second++;
            }
            first++;
        }
        return sb.toString();
    }
}