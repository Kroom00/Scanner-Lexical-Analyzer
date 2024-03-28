import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LexicalAnalyzerr {
    public static void main(String[] args) {
        // Input string to be analyzed
        String input = "start int x = 5; // This is a comment\nfinish ; 5<=6 ; 4==4; <>  ;:   4*6+8  ";
        
        // Defining keywords, operators and delimiters
        List<String> keywords = Arrays.asList("start", "finish", "then", "if", "repeat", "var", "int", "float", "do", "read", "print", "void", "return");
        List<String> relationalOperators = Arrays.asList("==", "<", ">", "!=", ">=", "<=");
        List<String> otherOperators = Arrays.asList("=", "+", "-", "*", "/", "%");
        List<String> delimiters = Arrays.asList(".", ",", ";", "(", ")", "{", "}");
           
        // Initializing symbol table and tokens list
        Map<String, Integer> symbolTable = new HashMap<>();
        List<String> tokens = new ArrayList<>();
        int lineNumber = 1;

        // Splitting input into lines
        String[] lines = input.split("\n");
        for (String line : lines) {
            // Splitting each line into words
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.startsWith("//")) {
                    break; // Ignore comments
                } else if (keywords.contains(word.toLowerCase())) {
                    tokens.add("Keyword: " + word);
                } else if (relationalOperators.contains(word)) {
                    tokens.add("Relational Operator: " + word);
                } else if (otherOperators.contains(word)) {
                    tokens.add("Operator: " + word);
                } else if (delimiters.contains(word)) {
                    tokens.add("Delimiter: " + word);
                } else if (word.matches("[a-zA-Z][a-zA-Z0-9]{0,7}")) {
                    tokens.add("Identifier: " + word);
                      // Add identifier to symbol table
                   if (!symbolTable.containsKey(word)) {symbolTable.put(word, lineNumber);}

                } else if (word.matches("-?[0-9]{1,8}")) {
                    tokens.add("Number: " + word);
                } else {
                    tokens.add("Invalid Symbol: " + word + ", Line: " + lineNumber);
                }
            }
            lineNumber++;
        }

        // Printing the total number of lexemes, the tokens and the symbol table
        System.out.println("Total number of lexemes available in the program: " + tokens.size());
        System.out.println("Tokens:");
        for (String token : tokens) {
            System.out.println(token);
        }
        System.out.println("Symbol Table:");
        for (Map.Entry<String, Integer> entry : symbolTable.entrySet()) {
            System.out.println(entry.getKey() + ": Line " + entry.getValue());
        }
    }
}
