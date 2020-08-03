import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<wordCount> wc = new ArrayList<>();

        wc.add(new wordCount());
        wc.add(new wordCount("hello", 17));
        wc.add(new wordCount("yes", 10));
        wc.add(new wordCount("mad", 13));
        wc.add(new wordCount("mir", 6));

        for(int i = 0; i < wc.size(); i++) {
            System.out.println(wc.get(i));
        }
        
        System.out.println("break");
        
        wordCount tempWC = new wordCount();
        for(int i = 0; i < wc.size(); i++) {
            for(int j = 0; j < wc.size(); j++) {
                if(wc.get(i).compareTo(wc.get(j)) > 0) {
                    tempWC = wc.get(i);
                    wc.set(i, wc.get(j));
                    wc.set(j, tempWC);
                }
            }
        }

        for(int i = 0; i < wc.size(); i++) {
            System.out.println(wc.get(i));
        }
    }
}