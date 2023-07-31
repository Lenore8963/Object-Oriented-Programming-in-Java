
public class WordPlay {
    public boolean isVowel (char ch) {
        return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
    }
    
    public String replaceVowels (String phrase, char ch) {
        StringBuilder phraseWithVowel = new StringBuilder(phrase);
        for(int i = 0; i < phraseWithVowel.length(); i++) {
            char currChar = phraseWithVowel.charAt(i);
            if (isVowel(currChar)) {
                phraseWithVowel.setCharAt(i, ch);
            }
        }
        return phraseWithVowel.toString();
    }
    
    public String emphasize (String phrase, char ch) {
        StringBuilder phraseWithCh = new StringBuilder(phrase);
        for(int i = 0; i < phraseWithCh.length(); i++) {
            char currChar = phraseWithCh.charAt(i);
            if (Character.toLowerCase(currChar) == Character.toLowerCase(ch)) {
                if (i%2 == 0) {
                    phraseWithCh.setCharAt(i, '*');
                } else {
                    phraseWithCh.setCharAt(i, '+');
                }
            }
        }
        return phraseWithCh.toString();
    }
    
    public void test () {
        boolean vowel1 = isVowel ('F');
        System.out.println("F is vowel? " + vowel1);
        boolean vowel2 = isVowel ('a');
        System.out.println("a is vowel? " + vowel2);
        String phrase1 = replaceVowels ("Hello World", '*');
        System.out.println("Hello World " + phrase1);
        String phrase2 = emphasize ("dna ctgaaactga", 'a');
        System.out.println("dna ctgaaactga " + phrase2);
        String phrase3 = emphasize ("Mary Bella Abracadabra", 'a');
        System.out.println("Mary Bella Abracadabra " + phrase3);
    }
}