public class Main{
  public static void main(String[] args){
      Movie m1=new Movie("Andhalarakshasi","02h:30m",9.2f);
      m1.details();
  }
}
public class Movie{
   String name;
   String duration;
   float rating;
  Movie(String name,String duration,float rating){
  this.name=name;
  this.duration=duration;
  this.rating=rating;
}
  
  void details(){
  System.out.println("------------");
  System.out.println("Movie Name:"+ name);
  System.out.println("Movie duration:"+ duration);
  System.out.println("Movie rating:"+ rating);
  if(rating>=8){
      System.out.println("movie is hit");
  }else if(rating>=3){
      System.out.println("movie is average");
  }else{
      System.out.println("movie is flop");
  }
  System.out.println();
  System.out.println("--------");
 }
}
