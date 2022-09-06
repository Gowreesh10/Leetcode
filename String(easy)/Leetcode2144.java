class Leetcode2144 {
    public int mostWordsFound(String[] sentences) {
        int maxwords=0;
        for(int i=0;i<sentences.length;i++){
            maxwords=Math.max(maxwords,sentences[i].split(" ").length);
        }
        return maxwords;
    }
}