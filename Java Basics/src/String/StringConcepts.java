package String;

public class StringConcepts {
    public static void main(String[] args) {
        System.out.println("========== JAVA STRING CONCEPTS ==========\n");

        // ===== 1. String Creation =====
        System.out.println("1. STRING CREATION");
        System.out.println("------------------------");
        String str1 = "Hello";  // String literal (created in String pool)
        String str2 = new String("Hello");  // String object (created in heap)
        String str3 = "Hello";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str3: " + (str1 == str3) + " (same reference in pool)");
        System.out.println("str1 == str2: " + (str1 == str2) + " (different objects)");
        System.out.println("str1.equals(str2): " + str1.equals(str2) + " (same content)\n");

        // ===== 2. String Immutability =====
        System.out.println("2. STRING IMMUTABILITY");
        System.out.println("------------------------");
        String original = "Java";
        String modified = original.concat(" Program");
        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + modified);
        System.out.println("Note: Original remains unchanged - Strings are immutable\n");

        // ===== 3. String Methods - Length & Indexing =====
        System.out.println("3. LENGTH AND INDEXING");
        System.out.println("------------------------");
        String text = "Hello";
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Character at index 4: " + text.charAt(4));
        System.out.println("First occurrence of 'l': " + text.indexOf('l'));
        System.out.println("Last occurrence of 'l': " + text.lastIndexOf('l'));
        System.out.println("Index of substring 'llo': " + text.indexOf("llo") + "\n");

        // ===== 4. Substring =====
        System.out.println("4. SUBSTRING");
        System.out.println("------------------------");
        String fullText = "Java Programming";
        System.out.println("Full text: " + fullText);
        System.out.println("substring(0, 4): " + fullText.substring(0, 4));
        System.out.println("substring(5): " + fullText.substring(5));
        System.out.println("substring(5, 16): " + fullText.substring(5, 16) + "\n");

        // ===== 5. Case Conversion =====
        System.out.println("5. CASE CONVERSION");
        System.out.println("------------------------");
        String mixed = "Hello World";
        System.out.println("Original: " + mixed);
        System.out.println("toUpperCase(): " + mixed.toUpperCase());
        System.out.println("toLowerCase(): " + mixed.toLowerCase() + "\n");

        // ===== 6. String Concatenation =====
        System.out.println("6. STRING CONCATENATION");
        System.out.println("------------------------");
        String first = "Java";
        String second = "Programming";
        System.out.println("Using + operator: " + first + " " + second);
        System.out.println("Using concat(): " + first.concat(" ").concat(second));
        System.out.println("Using String.join(): " + String.join(" ", first, second) + "\n");

        // ===== 7. Comparison Methods =====
        System.out.println("7. STRING COMPARISON");
        System.out.println("------------------------");
        String a = "Apple";
        String b = "apple";
        String c = "Apple";
        System.out.println("a = \"" + a + "\", b = \"" + b + "\", c = \"" + c);
        System.out.println("a.equals(c): " + a.equals(c) + " (case-sensitive)");
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b) + " (case-insensitive)");
        System.out.println("a.compareTo(c): " + a.compareTo(c) + " (0 = equal)");
        System.out.println("a.compareTo(b): " + a.compareTo(b) + " (negative = a < b)\n");

        // ===== 8. String Search Methods =====
        System.out.println("8. STRING SEARCH METHODS");
        System.out.println("------------------------");
        String sentence = "Java is great and Java is powerful";
        System.out.println("Text: " + sentence);
        System.out.println("contains(\"great\"): " + sentence.contains("great"));
        System.out.println("startsWith(\"Java\"): " + sentence.startsWith("Java"));
        System.out.println("endsWith(\"powerful\"): " + sentence.endsWith("powerful"));
        System.out.println("matches digits: " + "12345".matches("\\d+") + "\n");

        // ===== 9. String Replacement =====
        System.out.println("9. STRING REPLACEMENT");
        System.out.println("------------------------");
        String original2 = "I like cats, cats are cute";
        System.out.println("Original: " + original2);
        System.out.println("replace(\"cats\", \"dogs\"): " + original2.replace("cats", "dogs"));
        System.out.println("replaceAll(\"[aeiou]\", \"*\"): " + original2.replaceAll("[aeiou]", "*"));
        System.out.println("replaceFirst(\"cats\", \"dogs\"): " + original2.replaceFirst("cats", "dogs") + "\n");

        // ===== 10. Trimming Whitespace =====
        System.out.println("10. TRIMMING WHITESPACE");
        System.out.println("------------------------");
        String withSpaces = "  Hello World  ";
        System.out.println("Original (with pipes): |" + withSpaces + "|");
        System.out.println("After trim(): |" + withSpaces.trim() + "|");
        System.out.println("After strip(): |" + withSpaces.strip() + "|\n");

        // ===== 11. String Splitting =====
        System.out.println("11. STRING SPLITTING");
        System.out.println("------------------------");
        String csv = "John,Doe,30,Engineer";
        String[] parts = csv.split(",");
        System.out.println("Original: " + csv);
        System.out.println("Split by comma:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("  [" + i + "]: " + parts[i]);
        }
        System.out.println();

        // ===== 12. String Joining =====
        System.out.println("12. STRING JOINING");
        System.out.println("------------------------");
        String[] words = {"Java", "is", "awesome"};
        System.out.println("Array: " + java.util.Arrays.toString(words));
        System.out.println("Joined with space: " + String.join(" ", words));
        System.out.println("Joined with '-': " + String.join("-", words) + "\n");

        // ===== 13. Empty & Blank Checks =====
        System.out.println("13. EMPTY AND BLANK CHECKS");
        System.out.println("------------------------");
        String empty = "";
        String blank = "   ";
        String notBlank = "  text  ";
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("blank.isEmpty(): " + blank.isEmpty());
        System.out.println("blank.isBlank(): " + blank.isBlank() + " (Java 11+)");
        System.out.println("notBlank.isBlank(): " + notBlank.isBlank() + "\n");

        // ===== 14. String Formatting =====
        System.out.println("14. STRING FORMATTING");
        System.out.println("------------------------");
        String name = "Alice";
        int age = 25;
        double salary = 45000.50;
        System.out.println(String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary));
        System.out.println(String.format("Decimal: %d, Hex: %x, Octal: %o", 255, 255, 255));
        System.out.println();

        // ===== 15. StringBuilder for Concatenation =====
        System.out.println("15. STRINGBUILDER FOR EFFICIENT CONCATENATION");
        System.out.println("------------------------");
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" ");
        sb.append("Programming");
        sb.append(" ");
        sb.append("Language");
        System.out.println("Built string: " + sb);
        System.out.println("Reverse: " + sb.reverse());
        System.out.println("Length: " + sb.length());
        System.out.println("Insert at index 4: " + sb.insert(4, " is") + "\n");

        // ===== 16. StringBuffer (Thread-safe version) =====
        System.out.println("16. STRINGBUFFER (Thread-safe)");
        System.out.println("------------------------");
        StringBuffer sbf = new StringBuffer("Thread Safe");
        sbf.append(" String");
        System.out.println("StringBuffer: " + sbf);
        System.out.println("Delete (5, 11): " + sbf.delete(5, 11));
        System.out.println("setCharAt(6, '*'): ");
        sbf.setCharAt(6, '*');
        System.out.println(sbf + "\n");

        // ===== 17. String to Primitive Conversions =====
        System.out.println("17. STRING TO PRIMITIVE CONVERSIONS");
        System.out.println("------------------------");
        String numStr = "123";
        String doubleStr = "45.67";
        String boolStr = "true";
        System.out.println("Integer.parseInt(\"123\"): " + Integer.parseInt(numStr));
        System.out.println("Double.parseDouble(\"45.67\"): " + Double.parseDouble(doubleStr));
        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean(boolStr));
        System.out.println();

        // ===== 18. Primitive to String Conversions =====
        System.out.println("18. PRIMITIVE TO STRING CONVERSIONS");
        System.out.println("------------------------");
        int num = 42;
        double dbl = 3.14;
        boolean bool = true;
        System.out.println("String.valueOf(42): " + String.valueOf(num));
        System.out.println("String.valueOf(3.14): " + String.valueOf(dbl));
        System.out.println("String.valueOf(true): " + String.valueOf(bool));
        System.out.println("Integer.toString(42): " + Integer.toString(num) + "\n");

        // ===== 19. Character Methods =====
        System.out.println("19. CHARACTER METHODS");
        System.out.println("------------------------");
        String chars = "Hello123!";
        System.out.println("Text: " + chars);
        System.out.println("Character.isUpperCase('H'): " + Character.isUpperCase('H'));
        System.out.println("Character.isLowerCase('e'): " + Character.isLowerCase('e'));
        System.out.println("Character.isDigit('1'): " + Character.isDigit('1'));
        System.out.println("Character.isLetter('!'): " + Character.isLetter('!'));
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' ') + "\n");

        // ===== 20. String Intern =====
        System.out.println("20. STRING INTERN (Pool Management)");
        System.out.println("------------------------");
        String s1 = new String("Intern");
        String s2 = s1.intern();
        String s3 = "Intern";
        System.out.println("s1 == s2: " + (s1 == s2) + " (before intern vs after)");
        System.out.println("s2 == s3: " + (s2 == s3) + " (after intern same pool)\n");

        System.out.println("========== END OF STRING CONCEPTS ==========");
    }
}

