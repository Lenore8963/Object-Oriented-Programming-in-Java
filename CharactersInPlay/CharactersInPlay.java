import java.util.ArrayList;
import edu.duke.*;

public class CharactersInPlay {
    private ArrayList<String> names;
    private ArrayList<Integer> counts;
    
    public CharactersInPlay() {
        names = new ArrayList<String>();
        counts = new ArrayList<Integer>();
    }
    
    private void update (String person) {
        int index = names.indexOf(person);
        if (index == -1){
            names.add(person);
            counts.add(1);
        }
        else {
            int count = counts.get(index);
            counts.set(index,count+1);
            }
    }
    
    public void findAllCharacters () {
        names.clear();
        counts.clear();
        FileResource fr = new FileResource();
        for (String line : fr.lines()) {
            if (line.indexOf(".") !=-1) {
                update (line.substring(0, line.indexOf(".")));
            }
        }
    }
    
    public void tester () {
        findAllCharacters ();
        for (int k=0; k < names.size(); k++){
            if (counts.get(k) > 10) {
                System.out.println(names.get(k) + " " + counts.get(k));
            }
        }
    }
    
    public void charactersWithNumParts (int num1, int num2) {
        for (int k=0; k < names.size(); k++){
            if (counts.get(k) >= num1 && counts.get(k) <= num2) {
                System.out.println(names.get(k) + " " + counts.get(k));
            }
        }
    }
}
