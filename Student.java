public class Student extends Person {

   int grade;
   
   public Student() { super(); System.out.print("3 "); }
   
   public Student(int id, String firstname, int grade) { super(id, firstname); System.out.print("4 "); }

}