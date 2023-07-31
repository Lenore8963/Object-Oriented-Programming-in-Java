
public class CaesarCipher {

    private final String alphUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String alphLower = "abcdefghijklmnopqrstuvwxyz";
    private String shiftedAlphUpper;
    private String shiftedAlphLower;
    private int mainKey;
    
    public CaesarCipher (int key) {
        shiftedAlphUpper = shiftAlphabet (alphUpper, key);
        shiftedAlphLower = shiftAlphabet (alphLower, key);
        mainKey = key;
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
            if(idxUpper != -1){
                c = shiftedAlphUpper.charAt(idxUpper);
                sb.setCharAt(i, c);
            }
            else if(idxLower != -1){
                c = shiftedAlphLower.charAt(idxLower);
                sb.setCharAt(i, c);
            }
        }
        return sb.toString();
    }    
    
    public String decrypt (String input) {
        CaesarCipher cc = new CaesarCipher(26 - mainKey);
        return cc.encrypt(input);
    }

}
