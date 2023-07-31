# Word Lengths Counter

This Java class, `WordLengths`, helps to count the frequency of word lengths in a text file. It provides a method `countWordLengths` to process a `FileResource` object and store the word length frequency in an integer array.

This is a Coursera course assignment.
Course:
Java Programming: Arrays, Lists, and Structured Data
https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Usage

1. Import the `edu.duke.*` library from the Duke University Java course [available here](https://www.dukelearntoprogram.com//downloads/archives/duke-java-2020.zip).

2. Create an instance of the `WordLengths` class.

3. Call the `testCountWordLengths` method to process a text file and display the word length frequency.

## Class Methods

### countWordLengths(FileResource resource, int[] counts)

- Takes two arguments:
  - `resource`: A `FileResource` object containing the text file to be processed.
  - `counts`: An integer array to store the word length frequencies.
- Processes the `FileResource` object and counts the frequency of word lengths, excluding non-letter characters at the beginning or end of a word.

### testCountWordLengths()

- Opens a `FileResource` object to select a text file.
- Initializes an integer array of size 31 to store the word length frequencies.
- Calls the `countWordLengths` method with the `FileResource` object and the integer array.
- Displays the frequency of each word length in the text file.

## Example

```java
public class Main {
    public static void main(String[] args) {
        WordLengths wordLengthsCounter = new WordLengths();
        wordLengthsCounter.testCountWordLengths();
    }
}
```
In this example, we create an instance of the WordLengths class and call the testCountWordLengths method to count word lengths and display the frequencies.
