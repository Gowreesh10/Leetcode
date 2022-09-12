package Weekly_contest.Medium;

public class Leetcode2405_C310 {
    public int partitionString(String s) {
        String str="";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))==-1){
                str+=s.charAt(i);
            }  
            else{
                str=""+s.charAt(i);
                count++;
            }
        }
        return count;
    }
}
