# GladLibMap
GladLibMap is a Java class that generates randomized "Mad Libs" style stories by replacing certain words in a given template with words from different categories. This class utilizes a HashMap to store words from various categories, allowing for easy management and modification of word lists.

This is a Coursera course assignment. Course: Java Programming: Arrays, Lists, and Structured Data https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Usage
To use the GladLibMap class, first create an instance of it:

```java
GladLibMap gladLib = new GladLibMap();
```
To create a story, call the makeStory() method:

```java
gladLib.makeStory();
```
The generated story will be printed to the console.

To find the total number of words in all ArrayLists in the HashMap, call the totalWordsInMap() method:

```java
int totalWords = gladLib.totalWordsInMap();
```
To find the total number of words in the ArrayLists of the categories used for a particular story, call the totalWordsConsidered() method:

```java
int wordsConsidered = gladLib.totalWordsConsidered();
```

## Customization
To customize the data source directory for the word lists, create an instance of GladLibMap with the source parameter:

```java
GladLibMap customGladLib = new GladLibMap("custom/data/directory");
```

## Dependencies
edu.duke.*
java.util.*
These dependencies are part of the Duke University Java course library, and they are used for reading files and directories, as well as handling data structures like HashMap and ArrayList.
