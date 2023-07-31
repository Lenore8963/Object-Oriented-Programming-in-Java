# Object-Oriented-Caesar-Cipher
This Java project provides an implementation of the Caesar Cipher, a simple substitution cipher used for encrypting and decrypting text. The project includes a single and a two-key encryption and decryption system, as well as utility functions for letter counting, frequency analysis, and key breaking.

This is a Coursera course assignment. 
Course: Java Programming: Arrays, Lists, and Structured Data 
https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Classes
The project is divided into the following classes:

1. CaesarCipher: Implements the single-key Caesar Cipher encryption and decryption.
2. TestCaesarCipher: Provides methods for testing the CaesarCipher class and breaking the cipher using frequency analysis.
3. CaesarCipherTwo: Implements the two-key Caesar Cipher encryption and decryption.
4. TestCaesarCipherTwo: Provides methods for testing the CaesarCipherTwo class and breaking the two-key cipher using frequency analysis.

## Usage
- Single-key Caesar Cipher
To use the single-key Caesar Cipher, create an instance of the CaesarCipher class with a key as an argument. Then call the encrypt() method to encrypt a string, and the decrypt() method to decrypt a string.

```java
CaesarCipher cc = new CaesarCipher(15);
String encrypted = cc.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?");
String decrypted = cc.decrypt(encrypted);
```

- Two-key Caesar Cipher
To use the two-key Caesar Cipher, create an instance of the CaesarCipherTwo class with two keys as arguments. Then call the encrypt() method to encrypt a string, and the decrypt() method to decrypt a string.

```java
CaesarCipherTwo cc = new CaesarCipherTwo(21, 8);
String encrypted = cc.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?");
String decrypted = cc.decrypt(encrypted);
```

- Breaking the Caesar Cipher
Use the TestCaesarCipher or TestCaesarCipherTwo classes to break the cipher using frequency analysis. Create an instance of the corresponding class, and then call the breakCaesarCipher() method.

```java
TestCaesarCipher testCC = new TestCaesarCipher();
String decrypted = testCC.breakCaesarCipher(encrypted);
```

```java
TestCaesarCipherTwo testCC2 = new TestCaesarCipherTwo();
String decrypted = testCC2.breakCaesarCipher(encrypted);
```

## Dependencies
This project requires the edu.duke package for file input/output.
