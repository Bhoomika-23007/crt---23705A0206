public class Odd {
    public static void main(String[] args) {
        int num=4521;
        int count=0;
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                count=count+1;
				num=num/10;
            }
        }
        System.out.println("Number of odd digits are:" + count);
    }
}