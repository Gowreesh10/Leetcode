public class Leetcode1859 {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(String i:str){
            int ind=(i.charAt(i.length()-1))-'0';
            res[ind-1]=i.substring(0,i.length()-1);
        }
        return  String.join(" ",res);
    }
}
