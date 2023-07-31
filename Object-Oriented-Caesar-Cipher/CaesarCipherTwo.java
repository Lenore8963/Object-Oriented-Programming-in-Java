

public class CaesarCipherTwo {
    
    private final String alphUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String alphLower = "abcdefghijklmnopqrstuvwxyz";
    private String alphabet;
    private String shiftedAlphUpper1;
    private String shiftedAlphLower1;
    private String shiftedAlphUpper2;
    private String shiftedAlphLower2;
    private int mainKey1;
    private int mainKey2;
    
    public CaesarCipherTwo (int key1, int key2) {
        shiftedAlphUpper1 = shiftAlphabet (alphUpper, key1);
        shiftedAlphLower1 = shiftAlphabet (alphLower, key1);
        shiftedAlphUpper2 = shiftAlphabet (alphUpper, key2);
        shiftedAlphLower2 = shiftAlphabet (alphLower, key2);
        mainKey1 = key1;
        mainKey2 = key2;
    }
    
    private String shiftAlphabet (String alph, int key) {
        return alph.substring(key) + alph.substring(0, key);
    }

    public String encrypt (String input) {
        StringBuilder sb = new StringBuilder(input);
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int idxUpper = alphUpper.indexOf(c);
            int idxLower = alphLower.indexOf(c);
            if (idxUpper != -1 && i%2==0) {
                char newChar = shiftedAlphUpper1.charAt(idxUpper);
                sb.setCharAt(i, newChar);
                
            } else if (idxUpper != -1 && i%2!=0) {
                char newChar = shiftedAlphUpper2.charAt(idxUpper);
                sb.setCharAt(i, newChar);
            } else if (idxLower != -1 && i%2==0) {
                char newChar = shiftedAlphLower1.charAt(idxLower);
                sb.setCharAt(i, newChar);
                
            } else if (idxLower != -1 && i%2!=0) {
                char newChar = shiftedAlphLower2.charAt(idxLower);
                sb.setCharAt(i, newChar);
            }
        }
        return sb.toString();
    }
    
    public String decrypt (String input) {
        CaesarCipherTwo cc = new CaesarCipherTwo((26 - mainKey1), (26 - mainKey2));
        return cc.encrypt(input);
    }
}
