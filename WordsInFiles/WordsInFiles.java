import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordsInFiles {
    private HashMap<String, ArrayList<String>> wordToFileMap;

    public WordsInFiles() {
        wordToFileMap = new HashMap<>();
    }

    private void addWordsFromFile(File f) {
        try {
            Scanner scanner = new Scanner(f);
            String fileName = f.getName();

            while (scanner.hasNext()) {
                String word = scanner.next();

                if (wordToFileMap.containsKey(word)) {
                    ArrayList<String> fileList = wordToFileMap.get(word);
                    if (!fileList.contains(fileName)) {
                        fileList.add(fileName);
                    }
                } else {
                    ArrayList<String> fileList = new ArrayList<>();
                    fileList.add(fileName);
                    wordToFileMap.put(word, fileList);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + f.getAbsolutePath());
        }
    }
    
    public void buildWordFileMap() {
        wordToFileMap.clear();
        DirectoryResource dr = new DirectoryResource();

        for (File f : dr.selectedFiles()) {
            addWordsFromFile(f);
        }
    }
    
    public int maxNumber() {
        int max = 0;
        for (ArrayList<String> fileList : wordToFileMap.values()) {
            if (fileList.size() > max) {
                max = fileList.size();
            }
        }
        return max;
    }
    
    public ArrayList<String> wordsInNumFiles(int number) {
        ArrayList<String> result = new ArrayList<>();

        for (String word : wordToFileMap.keySet()) {
            if (wordToFileMap.get(word).size() == number) {
                result.add(word);
            }
        }

        return result;
    }
    
    public void printFilesIn(String word) {
        if (wordToFileMap.containsKey(word)) {
            for (String fileName : wordToFileMap.get(word)) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Word not found in any file.");
        }
    }
    
    public void tester() {
        buildWordFileMap();
        ArrayList<String> list1 = wordsInNumFiles(7);
        System.out.println("The number of words occur in 7 files: " + list1.size());
        ArrayList<String> list2 = wordsInNumFiles(4);
        System.out.println("The number of words occur in 4 files: " + list2.size());
        printFilesIn("sea");
        System.out.println("\n");
        printFilesIn("tree");
        //int max = maxNumber();
        //System.out.println("Maximum number of files any word appears in: " + max);

        //ArrayList<String> wordsInMaxFiles = wordsInNumFiles(max);
        //System.out.println("Words that appear in the maximum number of files: " + wordsInMaxFiles);

        //for (String word : wordsInMaxFiles) {
            //System.out.println("Files containing the word \"" + word + "\":");
            //printFilesIn(word);
            //System.out.println();
        //}
    }
}