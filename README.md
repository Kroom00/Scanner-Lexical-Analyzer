# Scanner-Lexical-Analyzer
## Introduction

This report documents the design and development of a scanner/lexical analyzer for analyzing programs or pseudocode according to specific rules. The scanner is capable of identifying various lexical elements, including identifiers, keywords, operators, delimiters, and comments. Additionally, it counts the total number of lexemes, extracts tokens, and maintains a symbol table.

## Requirements

The scanner/lexical analyzer is developed based on the following rules and requirements:
1. Case-insensitive analysis.
2. Input can contain English letters (upper and lower), digits, and specified additional characters.
3. Identifiers must start with a letter and may be followed by letters or digits (max 8 characters).
4. Predefined keywords include: start, finish, then, if, repeat, var, int, float, do, read, print, void, and return.
5. Relational operators: ==, <, >, !=, >=, and <=.
6. Other operators: =, +, -, *, /, and %.
7. Delimiters: ., (, ), ,, {, }, and ;.
8. Positive and negative numbers allowed (max 8 digits).
9. Comments start with // and end with a new line.

## Design and Implementation

### Input and Reading
The scanner takes input program/pseudocode, reads it character by character, and performs analysis.

### Tokenization
Lexical elements are tokenized using regular expressions and finite automata to classify tokens accurately.

### Symbol Table
A symbol table is maintained to track identifiers and their attributes efficiently.

### Error Handling
The scanner validates input, detects errors, and displays relevant error messages with line numbers.

## Output

### Test Cases

1. Input:

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/0c2d55d2-9e3e-4494-bcce-d113d86641b5)

1. Output:1

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/11bd2a1c-0090-44c5-a800-753c2cf68801)

2. Input:

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/e184a175-8090-4e11-8357-d4d1aaa0b1ce)

2. Output:2

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/0b519ee5-27a2-473b-a6d2-3e0f898ac784)


3. Input:

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/023ae06c-ff14-4e21-b88d-5672da04c2c9)


3. Output:3

![image](https://github.com/Kroom00/Scanner-Lexical-Analyzer/assets/88386673/15aa9729-40c5-4dd0-84f6-27d2d24ccfe0)


## Conclusion

The developed scanner/lexical analyzer effectively analyzes input program/pseudocode, ensuring adherence to lexical rules and reporting errors. It provides a solid foundation for further compiler or interpreter development, facilitating syntax analysis and subsequent phases' execution.
