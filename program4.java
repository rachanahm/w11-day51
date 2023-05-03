import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class IntegerList {
  public Integer insert(ArrayList<Integer> sample){
    Scanner input = new Scanner(System.in);
          System.out.println("Enter number to add:");
          int number = input.nextInt();
          sample.add(number);
    return number;
  }

    ArrayList delete(ArrayList<Integer> sample){
    Scanner input = new Scanner(System.in);
          System.out.println("Enter the number to delete:");
          int number = input.nextInt();
      for(Integer s : sample){
        if(number == s){
          sample.remove(s);
          break;
        }
        else {
          System.out.println("Name not found");
          break;
        }
      }
      return sample;
  }

  ArrayList ascOrder(ArrayList<Integer> sample){
    Collections.sort(sample);
    return sample;
  }

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sample = new ArrayList<>();
        IntegerList n = new IntegerList();

      for(int i=0;i<3;i++){
      n.insert(sample);
      }
      System.out.println("Before Sorting");
       for(Integer s : sample){
        System.out.print(s+" ");
      }

      ArrayList<Integer> asc = n.ascOrder(sample);
      System.out.println("After Sorting");
      for(Integer s : asc){
        System.out.print(s+" ");
      }
    }
}