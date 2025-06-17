public class Main{
  public static void main(String[] args){
      Teacher t1=new Teacher("Bayareddy","23705","EEE",new String[] {"networks","emf","powersystem"});
      t1.details();
  }
}
public class Teacher{
   String name;
   String id;
   String dept;
   String[] subjects;
  Teacher(String name,String id,String dept,String[] subjects){
  this.name=name;
  this.id=id;
  this.dept=dept;
  this.subjects=subjects;
    
}
  
  void details(){
  System.out.println("------------");
  System.out.println("Teacher Name:"+ name);
  System.out.println("Teacher id:"+ id);
  System.out.println("Teacher dept:"+ dept);
  System.out.print("subjects:");
  for(String subject:subjects){
      System.out.print(subject+",");
  }
  System.out.println();
  System.out.println("--------");
 }
}
