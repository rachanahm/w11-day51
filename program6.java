//Create a HashSet of integers and add at least five different integers to it. Use a for-each loop to print out each element in the HashSet.
import java.util.HashSet;
 class program6 {
  public static void main(String[] args) {
    HashSet<Integer> n = new HashSet<Integer>();
    n.add(3);
    n.add(7);
    n.add(2);
    n.add(8);
    n.add(5);
    for (int number : n) {
      System.out.println(number);
    }
  }
}
