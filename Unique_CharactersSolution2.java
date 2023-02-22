import java.util.LinkedHashSet;

public class UniqueChars {
   public static void main(String[] args) {
      String input = "Hello World";
      System.out.println("Input string: " + input);

      LinkedHashSet<Character> uniqueChars = new LinkedHashSet<Character>();

      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);
         if (!uniqueChars.contains(ch)) {
            uniqueChars.add(ch);
         }
      }

      System.out.print("Unique characters: ");
      for (Character ch : uniqueChars) {
         System.out.print(ch);
      }
   }
}
