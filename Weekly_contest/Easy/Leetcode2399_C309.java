package Weekly_contest.Easy;

public class Leetcode2399_C309 {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    byte dist=(byte)(j-i-1);
                    if(distance[s.charAt(i)-'a']!=dist)
                        return false;
                }
            }
        }
        return true;
    }
}
