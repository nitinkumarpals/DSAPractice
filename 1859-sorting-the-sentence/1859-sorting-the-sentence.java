class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String ans[] = new String[9];
        int count=0;
        s="";
        for(int i=0; i<words.length; i++){
            int pos = words[i].charAt(words[i].length()-1)-'0';
            ans[pos-1] = words[i].substring(0, words[i].length()-1)+" ";
            count++;
        }

        for(int i=0; i<count; i++){
            s+=ans[i];
        }
        return s.substring(0, s.length()-1);
    }
}