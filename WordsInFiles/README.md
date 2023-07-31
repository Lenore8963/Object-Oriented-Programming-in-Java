# WordsInFiles

WordsInFiles is a Java class that helps to analyze the occurrences of words in a group of text files. The class builds a HashMap where each word maps to an ArrayList of file names in which the word appears. Using this HashMap, the class provides methods to answer questions such as:

- What is the maximum number of files any word appears in?
- Which words appear in exactly N files?
- In which files does a specific word appear?

This is a Coursera course assignment. Course: Java Programming: Arrays, Lists, and Structured Data https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Usage
To use the WordsInFiles class, first create an instance of it:

```java
WordsInFiles wordsInFiles = new WordsInFiles();
```
Then, call the buildWordFileMap() method to build the HashMap. This method prompts you to select a group of files, reads all the words from those files, and adds them to the HashMap:

```java
wordsInFiles.buildWordFileMap();
```
To find the maximum number of files any word appears in, use the maxNumber() method:

```java
int maxFiles = wordsInFiles.maxNumber();
```
To get an ArrayList of words that appear in exactly N files, use the wordsInNumFiles(int number) method:

```java
ArrayList<String> wordsInNFiles = wordsInFiles.wordsInNumFiles(2);
```
To print the names of the files in which a specific word appears, use the printFilesIn(String word) method:

```java
wordsInFiles.printFilesIn("example");
```

## Dependencies
edu.duke.DirectoryResource
edu.duke.FileResource

These dependencies are part of the Duke University Java course library and are used to read files and directories.
