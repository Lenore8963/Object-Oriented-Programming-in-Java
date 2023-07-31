import edu.duke.*;

public class WordLengths {
    
    public void countWordLengths (FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int length = word.length();
            char startWith = word.charAt(0);
            char endWith = word.charAt(length-1);
            if (length !=0 && !Character.isLetter(startWith) ) {
                length--;
            } 
            if (length !=0 && !Character.isLetter(endWith) ) {
                length--;
            }
            if (length < counts.length) {
                counts[length]++;
            } else {
                counts[counts.length -1]++;
            }
        }
    }
    
    public void testCountWordLengths () {
        FileResource fr = new FileResource();
        int[] counts = new int[31];
        countWordLengths (fr, counts);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] !=0) {
            System.out.println("Number of words in length " + i + " is: " + counts[i]);
            }
        }
    }
}
