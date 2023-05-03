//Write a program that reads in a string from the user and prints out all the unique characters in the string using a HashSet.
import java.util.HashSet;
import java.util.Scanner;
 class program7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    HashSet<Character> C = new HashSet<Character>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (!C.contains(c)) {
      C.add(c);
      }
    }
    System.out.println("Unique characters:");
    for (char c :  C) {
      System.out.print(c + " ");
    }
  }
}
