import edu.duke.*;

public class CaesarBreaker {
    public int[] countLetters (String message) {
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
    
    public int maxIndex (int[] vals) {
        int maxDex = 0;
        for (int k=0; k < vals.length; k++) {
            if (vals[k] > vals[maxDex]) {
                maxDex = k;
            }
        }
        return maxDex;
    }
    
    public String decrypt (String encrypted) {
        CaesarCipher cc = new CaesarCipher();
        int key = getKey (encrypted);
        return cc.encrypt(encrypted, key);
    }
    
    public String halfOfString (String message, int start) {
        String newString ="";
        for (int i=0; (i+start) < message.length(); i=i+2) {
            newString += message.charAt(i+start);
        }
        return newString;
    }
    
    public int  getKey (String s) {
        int[] freqs = countLetters(s);
        int maxDex = maxIndex (freqs);
        int dkey = maxDex - 4;
        if (maxDex < 4) {
            dkey = 26 - (4-maxDex);
        }
        return dkey;
    }
    
    public String decryptTwoKeys (String encrypted) {
        String oddPart = halfOfString (encrypted, 0);
        String evenPart = halfOfString (encrypted, 1);
        int keyOdd = getKey(oddPart);
        int keyEven = getKey(evenPart);
        System.out.println("The two keys that were used to encrypt are: " + keyOdd + " and " + keyEven);
        CaesarCipher cc = new CaesarCipher();
        return cc.encryptTwoKeys (encrypted, 26-keyOdd, 26-keyEven);
    }

    public void testDecrypt() {
        String encrypted1 = "Gwpv c vbuq pvokki yfve iqqu qc bgbgbgbgbgbgbgbgbu";
        String message1 = decryptTwoKeys (encrypted1);
        System.out.println(encrypted1 + "\n" + message1);
        String encrypted2 = "Top ncmy qkff vi vguv vbg ycpx";
        CaesarCipher cc = new CaesarCipher();
        String message2 = cc.encryptTwoKeys (encrypted2, 24, 6);
        System.out.println(encrypted2 + "\n" + message2);
        String encrypted3 = "Akag tjw Xibhr awoa aoee xakex znxag xwko";
        String message3 = decryptTwoKeys (encrypted3);
        System.out.println(encrypted3 + "\n" + message3);
        FileResource fr = new FileResource();
        String contents = fr.asString();
        String message4 = decryptTwoKeys (contents);
        System.out.println(contents + "\n" + message4);
        
    }

}
