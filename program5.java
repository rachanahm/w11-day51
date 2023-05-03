//Write a program that creates an ArrayList of Student objects. Each Student object should have a name (String) and a grade (double). The program should allow the user to add and remove students from the list,
import java.util.*;
class Student{
 private String name;
 private  double grade;
  Student(String name,double grade){
    this.name=name;
    this.grade=grade;
  }
  
  public String getName() {
    return name;
}

 

public void setName(String name) {
    this.name = name;
}

 

public double getGrade() {
    return grade;
}

 

public void setGrade(double grade) {
    this.grade = grade;
}

 

public String toString(){
    return name+" "+grade;
    }
}
  
  
  
  class ArrayListDemo6{
    void insert(ArrayList<Student> std ){
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<3;i++){
      std.add(new Student(sc.next(),sc.nextDouble()));
      }
    }
    void remove( ArrayList<Student> std){
      std.remove(0);
    }
    void display(ArrayList<Student> std){
      for(Student b:std){
        System.out.println(b);
      }
    }
    
  public static void main(String args[]){
      ArrayList<Student> std = new ArrayList<Student>();
       ArrayListDemo6 b = new  ArrayListDemo6();
      Scanner sc = new Scanner(System.in);
       
      
       int choice;
       do{
         System.out.println("1 addition \n 2)removing \n 3)display \n 4)Quit :");
         System.out.println("Enter the choice :");
         choice = sc.nextInt();
         switch(choice){
           case 1:{
             b.insert(std);
             break;
           }
           case 2:{
              b.remove(std);
             break;
           }
           case 3:{
             b.display(std);
             break;
           }
           case 4:{
             System.out.println("Thank you :");
             break;
           }
         }
         
         
       }while(choice!=4);
      
    
  }
}