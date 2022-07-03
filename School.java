public class School {

   String name;
   
   public School() { System.out.print("1 "); }
   
   public School(String name) { System.out.print("2 "); }
   
   public static void main(String[] args) {
      
      Student s = new Student();// Question 1 Answer: 5, 3
      
      System.out.println("\n");
      
      Student s2 = new Student(1, "Doe", 8);// Question 2 Answer: 6, 4
   
   }

}