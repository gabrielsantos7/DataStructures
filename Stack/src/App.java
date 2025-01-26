import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    Map<Character, Character> parenthesesMap = new HashMap<>();
    parenthesesMap.put('(', ')');
    parenthesesMap.put('{', '}');
    parenthesesMap.put('[', ']');

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a mathematic expression: ");
    
    String expression = scanner.nextLine(); 
    scanner.close();

    for (char c : expression.toCharArray()) {
      // Verifica se o caractere atual é um parêntese de abertura
      if (parenthesesMap.containsKey(c)) {
        stack.push(c);

      // Verifica se o caractere atual é um parêntese de fechamento
      } else if (parenthesesMap.containsValue(c)) {
        if (stack.isEmpty()) {
          System.out.println("Invalid expression: unmatched closing parenthesis.");
          return;
        }

        // Verifica se o parêntese de fechamento corresponde ao parêntese de abertura armazenado na pilha
        char openingParenthesis = stack.peek();
        if (parenthesesMap.get(openingParenthesis) != c) {
          System.out.println("Invalid expression: unbalanced parentheses.");
          return;
        }
        stack.pop();
      }
    }

    if (!stack.isEmpty()) {
      System.out.println("Invalid expression: unmatched opening parenthesis.");
    } else {
      System.out.println("Valid expression.");
    }
  }
}
