public class Main{
  public static void main(String[] args){
      App a1=new App("Zomato","Food","100000","20k");
      a1.details();
  }
}
public class App{
   String name;
   String categery;
   String downloads;
   String reviews;
  App(String name,String categery,String downloads,String reviews){
  this.name=name;
  this.categery=categery;
  this.downloads=downloads;
  this.reviews=reviews;
}
  
  void details(){
  System.out.println("------------");
  System.out.println("App Name:"+ name);
  System.out.println("App Categery:"+ categery);
  System.out.println("App Downloads:"+ downloads);
  System.out.println("App Reviews:"+ reviews);
  int downloadCount=Integer.parseInt(downloads);
  if(downloadCount>=100000){
      System.out.println("App is popular");
  }else{
      System.out.println("App is unpopular");
  }
  System.out.println();
  System.out.println("--------");
 }
}
