public class Numberofdigits {
    public static void main(String[] args) {
        int num=4521;
        int count=0;
        while(num>0){
            num=num/10;
            count=count+1;
        }
        System.out.println("Number of digits are:" + count);
    }
}