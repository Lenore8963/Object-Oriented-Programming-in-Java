import edu.duke.*;

public class TestCaesarCipher {
    private int[] countLetters (String message) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for ( int k=0; k < message.length(); k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if (dex !=-1) {
                counts[dex] +=1;
            }
        }
        return counts;
    }
    
    private int maxIndex (int[] vals) {
        int maxDex = 0;
        for (int k=0; k < vals.length; k++) {
            if (vals[k] > vals[maxDex]) {
                maxDex = k;
            }
        }
        return maxDex;
    }

    private int getKey (String s) {
        int[] freqs = countLetters(s);
        int maxDex = maxIndex (freqs);
        int dkey = maxDex - 4;
        if (maxDex < 4) {
            dkey = 26 - (4-maxDex);
        }
        return dkey;
    }
    
    public String breakCaesarCipher (String input) {
        int key = getKey (input);
        CaesarCipher cc = new CaesarCipher(key);
        return cc.decrypt(input);
    }
    
    public void simpleTests () {
        String phrase1 = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipher cc = new CaesarCipher(15);
        String encrypted = cc.encrypt(phrase1);
        System.out.println("Encrypted: \n" + encrypted);

    }
}
