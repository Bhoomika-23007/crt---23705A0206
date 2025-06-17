public class Goodnumber {
    public static void main(String[] args) {
        int num=2321;
        int evenCount=0;
        int oddCount=0;
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                oddCount=oddCount+1;
            }
            else{
                evenCount=evenCount+1;
            }
            num=num/10;
        }
        int count=evenCount+oddCount;
        if(count==oddCount||count==evenCount){
            System.out.println("Good number");
        }
        else{
            System.out.println("Bad number");
        }
    }
}