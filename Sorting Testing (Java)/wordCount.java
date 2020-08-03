public class wordCount implements Comparable<wordCount> {
    private String word;
    private int count;

    public wordCount() {
        word = "example";
        count = 0;
    }

    public wordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getWord() {
        return word;
    }
    
    @Override
    public String toString() {
        return word+": "+count;
    }

    @Override
    public int compareTo(wordCount otherWC) {
        return this.getCount() - otherWC.getCount();
    }
}