# CharactersInPlay
This Java class, CharactersInPlay, is designed to analyze the frequency of character names in a play, book, or any text file.

This is a Coursera course assignment. Course: Java Programming: Arrays, Lists, and Structured Data https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

The class reads a text file and looks for lines containing a period (.) to identify character names. This is a common formatting convention used in plays, where character names are followed by a period and then their dialogue.

For example, in a Shakespeare play, you might see lines like:

```vbnet
HAMLET. To be, or not to be: that is the question:
```
The class will extract "HAMLET" as a character name and count its occurrences throughout the play. However, this method may not be foolproof, as it relies on the presence of a period to identify character names. For optimal results, ensure that the text file has a consistent format with character names followed by periods.

## Features
- Read text files and store character names and their occurrence counts
- Display character names that appear more than a specified number of times
- Display character names that appear within a specified range of times

## Dependencies
Duke University edu.duke library (download from http://www.dukelearntoprogram.com/course2/files.php)

## How to Use
1. Import the class into your project.
2. Create a CharactersInPlay object.
3. Call the tester() method on the object to analyze a text file and display character names with a count greater than 10.
4. Call the charactersWithNumParts(int num1, int num2) method on the object to display character names with a count within a specified range.

## Methods
- CharactersInPlay(): Constructor that initializes the names and counts ArrayLists.
- update(String person): Updates the names and counts ArrayLists with the given character name.
- findAllCharacters(): Reads a file and populates the names and counts ArrayLists with character names and their occurrence counts.
- tester(): Calls findAllCharacters() and prints character names with a count greater than 10.
- charactersWithNumParts(int num1, int num2): Prints character names with a count within the specified range (num1 to num2, inclusive).

Note: The findAllCharacters() method uses the FileResource class from the edu.duke library to read a file. Ensure the text file is in the correct directory or modify the code to specify the file path.
