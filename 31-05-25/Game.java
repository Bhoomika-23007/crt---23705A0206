public class Main{
  public static void main(String[] args){
      Game g1=new Game("Ludoking","Familyfriendly",4,8.5f);
      g1.details();
  }
}
public class Game{
   String name;
   String zonor;
   int playcount;
   float rating;
  Game(String name,String zonor,int playcount,float rating){
  this.name=name;
  this.zonor=zonor;
  this.playcount=playcount;
  this.rating=rating;
    
}
  
  void details(){
  System.out.println("------------");
  System.out.println("Game Name:"+ name);
  System.out.println("Game Zonor:"+ zonor);
  System.out.println("Game Playcount:"+ playcount);
  System.out.println("Game Rating:"+ rating);
  
 }
}
