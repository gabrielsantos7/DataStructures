import java.util.Scanner;

public class App {
    public static void insertCharacters(String word, HashTable<Character, Integer> table) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (table.containsKey(c)) {
                table.put(c, table.get(c) + 1);
            } else {
                table.put(c, 1);
            }
        }
    }

    public static boolean areAnagrams(HashTable<Character, Integer> table1, HashTable<Character, Integer> table2) {
        if (table1.isEmpty() && table2.isEmpty()) {
            return true;
        }
        
        if (table1.getSize() != table2.getSize()) {
            return false;
        }

        for (Character key : table1.keySet()) {
            if (!table1.get(key).equals(table2.get(key))) {
                return false;
            }
        }

        return true;

        
    }

    public static void main(String[] args) throws Exception {
        HashTable<Character, Integer> table1 = new HashTable<>();
        HashTable<Character, Integer> table2 = new HashTable<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        scanner.close();

        insertCharacters(word1, table1);
        insertCharacters(word2, table2);

        System.out.println(table1.toString());
        System.out.println(table2.toString());
        System.out.println("Strings are anagrams? " + (areAnagrams(table1, table2) ? "yes" : "no"));


    }
}
