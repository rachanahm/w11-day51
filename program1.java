//Create an ArrayList of Strings and add at least five different Strings to it. Use a for-each loop to print out each element in the ArrayList.
import java.util.ArrayList;
class program1{
  public static void main(String args[]){
    ArrayList<String> s=new ArrayList<>();
    s.add("rachana");
    s.add("ammu");
    s.add("ccc");
    s.add("ddd");
    s.add("eee");
    System.out.println(s);
    for(String st:s){
      System.out.println(st);
    }
  }
}