package RakibProblems.StringProblems01;


public class StringMethods {


    public static void main(String[] args) {
        String str = "Hello World!";
        printMessage(str);
    }


    public static void printMessage(String message) {

//        System.out.println(message);
//
//        // 1. length of the string
//        System.out.println("Length of the string: " + message.length());
//
//        // 2. toUpperCase() method
//        System.out.println("String in uppercase: " + message.toUpperCase());
//
//        // 3. toLowerCase() method
//        System.out.println("String in lowercase: " + message.toLowerCase());
//
//        // 4. charAt() method. Index starts from 0 in strings. This method returns the character at the specified index.
//        System.out.println("Character at index 4: " + message.charAt(4));


        // 5. indexOf() method. This method returns the index of the first occurrence of the specified character.

        // I will give input of a capital character where as the character in the string is in small letter. my code will ognore the case
        System.out.println("Index of 'o': " + message.indexOf('o'));
        System.out.println("Index of 'O': " + message.indexOf('O'));



//        // 6. lastIndexOf() method. This method returns the index of the last occurrence of the specified character.
//        System.out.println("Last index of 'o': " + message.lastIndexOf('o'));
//
//        // 7. substring() method. This method returns a substring (part of whole String) of the string.
//        System.out.println("Substring from index 2 to 7: " + message.substring(2, 7));
//
//        // 8. replace() method. This method replaces the specified character or string with another character or string.
//        System.out.println("Replace 'World' with 'Java': " + message.replace("World", "Java"));
//
//        // 9. trim() method. This method removes the leading and trailing white spaces.
//        String str2 = "   Hello World!   ";
//        System.out.println("String after trimming: " + str2.trim());
//
//        // 10. split() method. This method splits the string based on the specified delimiter.
//        String str3 = "Hello,World,Java";
//        String[] strArray = str3.split(",");
//
//        // print by for-each loop
//        System.out.println("Splitting the string by comma: ");
//
//        for (String s : strArray) {
//            System.out.println(s);
//        }
//
//        // printMessage(str3); by Arrays.toString method
//        System.out.println("print by toString method: " + Arrays.toString(strArray));
//
//
//        // 11. startsWith() method. This method checks if the string starts with the specified prefix.
//        System.out.println("String starts with 'Hello': " + message.startsWith("Hello"));
//
//        // 12. endsWith() method. This method checks if the string ends with the specified suffix.
//        System.out.println("String ends with 'World!': " + message.endsWith("World!"));
//
//        // 13. contains() method. This method checks if the string contains the specified character or sequence of
//        // characters.
//        System.out.println("String contains 'World': " + message.contains("World"));
//
//        // 14. equals() method. This method compares the content of two strings.
//        String str4 = "Hello World!";
//        System.out.println("String equals 'Hello World!': " + message.equals(str4));
//
//        // 15. equalsIgnoreCase() method. This method compares the content of two strings ignoring the case.
//        String str5 = "hello world!";
//        System.out.println("String equals ignore case 'hello world!': " + message.equalsIgnoreCase(str5));
//
//        // 16. isEmpty() method. This method checks if the string is empty.
//        System.out.println("String is empty: " + message.isEmpty());
//
//        // 17. concat() method. This method concatenates two strings.
//        System.out.println("Concatenation of two strings 'Hello' and 'World!': " + message.concat(" World!"));
//
    }



}

