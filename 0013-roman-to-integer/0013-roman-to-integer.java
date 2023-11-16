class Solution {
    public int romanToInt(String s) {
        int sum=0, index=0;
        while(index<s.length()-1){
            if(num(s.charAt(index))<num(s.charAt(index+1))){
                sum-=num(s.charAt(index));
          }
            else {
                sum+=num(s.charAt(index));
         }
         index++;
        }
        sum+=num(s.charAt(index));
        return sum;

    }
    public static int num(char c){
        if(c=='I'){
            return 1;
        }
        else if(c=='V'){
            return 5;
        }
        else if(c=='X'){
            return 10;
        }
        else if(c=='L'){
            return 50;
        }
        else if(c=='C'){
            return 100;
        }
        else if(c=='D'){
            return 500;
        }
        else if(c=='M'){
            return 1000;
        }
        return 0;
    }
}