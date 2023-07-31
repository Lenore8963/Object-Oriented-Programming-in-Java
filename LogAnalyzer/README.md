# LogAnalyzer

Log Analyzer is a Java project that allows users to analyze and extract useful information from server logs. The project consists of three main classes: LogEntry, WebLogParser, and LogAnalyzer.

This is a Coursera course assignment. Course: Java Programming: Arrays, Lists, and Structured Data https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Features
- Read and parse log files
- Count unique IP addresses
- Filter logs based on specific criteria (status code, date, etc.)
- Determine the most active IPs and days with the most visits

## Class Descriptions
### LogEntry
The LogEntry class represents a single log entry in a server log. Each entry has an IP address, access time, request, status code, and the number of bytes returned.

### WebLogParser
The WebLogParser class is responsible for parsing a log entry from a string in the log file. It converts the string into a LogEntry object with the appropriate data.

### LogAnalyzer
The LogAnalyzer class contains the main functionality of the project. It reads log files and creates a list of LogEntry objects. It provides various methods to analyze the logs, such as counting unique IP addresses, filtering logs based on specific criteria, and determining the most active IPs and days with the most visits.

## Usage
1. Create a LogAnalyzer object.
2. Call the readFile() method with the log file's filename as the argument.
3. Use the various methods in the LogAnalyzer class to analyze the logs and extract useful information.

## Example:

```java
LogAnalyzer analyzer = new LogAnalyzer();
analyzer.readFile("weblog.txt");
System.out.println("Unique IP count: " + analyzer.countUniqueIPs());
```
