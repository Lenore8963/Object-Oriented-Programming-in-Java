# WordFrequencies
This Java class, WordFrequencies, is designed to analyze the frequency of words in a text file. It uses the Duke University edu.duke library for file reading and processing.

This is a Coursera course assignment. Course: Java Programming: Arrays, Lists, and Structured Data https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Features
- Read text files and store unique words and their frequencies
- Find the most frequent word in the file
- Display the total number of unique words in the file

## Dependencies
Duke University edu.duke library (download from http://www.dukelearntoprogram.com/course2/files.php)

## How to Use
1. Import the class into your project.
2. Create a WordFrequencies object.
3. Call the tester() method on the object to analyze a text file and display results.

## Example Usage
```java
public static void main(String[] args) {
    WordFrequencies wordFrequencies = new WordFrequencies();
    wordFrequencies.tester();
}
```

## Methods
- WordFrequencies(): Constructor that initializes the myWords and myFreqs ArrayLists.
- findUnique(): Reads a file and populates the myWords and myFreqs ArrayLists with unique words and their frequencies.
- tester(): Calls findUnique() and prints the total number of unique words and the most frequent word in the file.
- findIndexOfMax(): Finds the index of the maximum frequency in the myFreqs ArrayList.

Note: The tester() method uses the FileResource class from the edu.duke library to read a file. Ensure the text file is in the correct directory or modify the code to specify the file path.
