import edu.duke.*;
import java.util.*;

public class GladLibMap {
    private HashMap<String, ArrayList<String>> myMap;
    private ArrayList<String> usedWords;
    private HashSet<String> usedCategories;
    private Random myRandom;
    private static String dataSourceURL = "http://dukelearntoprogram.com/course3/data";
    private static String dataSourceDirectory = "data";
    
    public GladLibMap() {
        initializeFromSource(dataSourceDirectory);
	myRandom = new Random();
	myMap = new HashMap<>();
	usedWords = new ArrayList<>();
	usedCategories = new HashSet<>();
    }
    
    public GladLibMap(String source) {
        initializeFromSource(source);
	myRandom = new Random();
	myMap = new HashMap<>();
	usedWords = new ArrayList<>();
	usedCategories = new HashSet<>();
    }
    
    private void initializeFromSource(String source) {
        String[] categories = {"adjective", "noun", "color", "country", "name", "animal", "timeframe", "verb", "fruit"};
        for (String category : categories) {
            myMap.put(category, readIt(source + "/" + category + ".txt"));
        }
    }
    
    private String randomFrom(ArrayList<String> source){
	int index = myRandom.nextInt(source.size());
	return source.get(index);
    }
    
    private String getSubstitute(String label) {
        if (myMap.containsKey(label)) {
            usedCategories.add(label);
            return randomFrom(myMap.get(label));
        }
        if (label.equals("number")) {
            return "" + myRandom.nextInt(50) + 5;
        }
        return "**UNKNOWN**";
    }
    
    private String processWord(String w){
	int first = w.indexOf("<");
	int last = w.indexOf(">",first);
	if (first == -1 || last == -1){
	    return w;
	}
	String prefix = w.substring(0,first);
	String suffix = w.substring(last+1);
	String sub = getSubstitute(w.substring(first+1,last));
	while (usedWords.contains(sub)) {
	    sub = getSubstitute(w.substring(first+1,last));
	}
	usedWords.add(sub);
	return prefix+sub+suffix;
    }
	
    private void printOut(String s, int lineWidth){
	int charsWritten = 0;
	for(String w : s.split("\\s+")){
	    if (charsWritten + w.length() > lineWidth){
		System.out.println();
		charsWritten = 0;
	    }
	    System.out.print(w+" ");
	    charsWritten += w.length() + 1;
	}
    }
	
    private String fromTemplate(String source){
	String story = "";
	if (source.startsWith("http")) {
	    URLResource resource = new URLResource(source);
	    for(String word : resource.words()){
		story = story + processWord(word) + " ";
	    }
	}
	else {
	    FileResource resource = new FileResource(source);
	    for(String word : resource.words()){
		story = story + processWord(word) + " ";
	    }
	}
	return story;
    }
	
    private ArrayList<String> readIt(String source){
	ArrayList<String> list = new ArrayList<String>();
	    if (source.startsWith("http")) {
		URLResource resource = new URLResource(source);
		for(String line : resource.lines()){
		    list.add(line);
		}
	    }
	    else {
		FileResource resource = new FileResource(source);
		for(String line : resource.lines()){
		    list.add(line);
		}
	    }
	return list;
    }
	
    public void makeStory(){
	usedWords.clear();
	System.out.println("\n");
	String story = fromTemplate("data/madtemplate2.txt");
	printOut(story, 60);
	System.out.println("Number of words that were replaced: " + usedWords.size());
    }
    
    public int totalWordsInMap() {
        int totalCount = 0;
        for (ArrayList<String> words : myMap.values()) {
            totalCount += words.size();
        }
        return totalCount;
    }

    public int totalWordsConsidered() {
        int totalCount = 0;
        for (String category : usedCategories) {
            totalCount += myMap.get(category).size();
        }
        return totalCount;
    }
}
