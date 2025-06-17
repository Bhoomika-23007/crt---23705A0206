 public class NoOfEvenElements {
    public static void main(String[] args) {
        int[] nums={44,43,42,10};
        int count=0;
        for(int i=0;i<=nums.length;i++){
            
            if(i%2==0){
                count=  count + 1;
            
            }
        }
        System.out.print("No.of even elements in an array:"+  count);
    }
}