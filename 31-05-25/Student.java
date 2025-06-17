public class Main{
  public static void main(String[] args){
     Student s1=new Student();
     System.out.println(s1.name);
     System.out.println(s1.roll);
     System.out.println(s1.attendence());
     s1.payfee(100000);
  }
}
public class Student{
   String name="Bhoomi";
   String roll="23705A0206";
   String branch="EEE";
   byte year=3;
   char section='B';
   void payfee(int amount){
       System.out.println("paying:"+amount+"to the clg");
   }
   int attendence(){
       System.out.println("sending the attendance to the student");
       return 80;
   }
}
