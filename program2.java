//Create an ArrayList of Integers and add at least five different integers to it. Write a method that takes the ArrayList as a parameter and returns the sum of all the integers in the ArrayList.
import java.util.ArrayList;
class ArrayListSum{
    public static int sumOfArrayList(ArrayList<Integer> list) {
    int sum=0;
    for(int i:list){
      sum+=i;
    }
      return sum;
  }
    public static void main(String args[]){
    ArrayList<Integer> s=new ArrayList<Integer>();
     ArrayListSum Sum = new ArrayListSum();
    s.add(12);
    s.add(34);
    s.add(56);
    s.add(7);
    s.add(7);
   System.out.println(Sum.sumOfArrayList(s));
}
}
 

