public class Prime {
    public static void main(String[] args) {
        int num=16;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}