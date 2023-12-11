class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char alpha='a';alpha<='z';alpha++)
            if(sentence.indexOf(alpha)==-1){
                return false;
            }
        return true;
    }
}