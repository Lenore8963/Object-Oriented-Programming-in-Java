# WordPlay
WordPlay is a simple Java program that demonstrates basic string manipulation techniques. It provides three main methods to check if a character is a vowel, replace vowels in a phrase with a given character, and emphasize a given character in a phrase.

This is a Coursera course assignment.
Course:
Java Programming: Arrays, Lists, and Structured Data
https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Methods
- boolean isVowel(char ch)
This method takes a character ch as input and returns true if it's a vowel (a, e, i, o, or u) and false otherwise. The method is case-insensitive.

- String replaceVowels(String phrase, char ch)
This method takes a String named phrase and a character ch as input. It replaces all the vowels in the phrase with the given character ch and returns the modified phrase.

- String emphasize(String phrase, char ch)
This method takes a String named phrase and a character ch as input. It replaces every instance of the character ch in the phrase with an asterisk (*) if the character is at an even index, or a plus sign (+) if the character is at an odd index. The method returns the modified phrase. This method is case-insensitive.

## Usage
To test the WordPlay class, you can run the test() method, which demonstrates the usage of the isVowel, replaceVowels, and emphasize methods.

```java
public static void main(String[] args) {
    WordPlay wordPlay = new WordPlay();
    wordPlay.test();
}
```

## Example Output
When running the test() method, you can expect output similar to the following:

```markdown
Copy code
F is vowel? false
a is vowel? true
Hello World H*ll* W*rld
dna ctgaaactga dn* ctg+*+ctg*
Mary Bella Abracadabra M*ry B*ll* *br*c*d*br*
```
