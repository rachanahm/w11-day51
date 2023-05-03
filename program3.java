//Write a program that creates an ArrayList of names (Strings) and allows the user to add and remove names from the list. The program should also allow the user to print out all the names in the list.
import java.util.ArrayList;
import java.util.Scanner;
 class NameList {
  Scanner sc=new Scanner(System.in);
   void insert(ArrayList a){
     for(int i=0;i<4;i++){
     a.add(sc.next());
     }
   }
   ArrayList delete(ArrayList<String> a){
     System.out.println("Enter name to remove");
     String r=sc.next();
     for(String s:a)
       if(r.equals(a)){
         a.remove(s);
         break;
       }
       return a;
     }
     public static void main(String args[]){
       ArrayList<String> str=new ArrayList<String>();
       NameList arr=new NameList();
       arr.insert(str);
       System.out.println(arr.delete(str));
     }
   }
  