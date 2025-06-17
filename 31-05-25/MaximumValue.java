public class MaximumValue {
    public static void main(String[] args) {
        int[] nums={100,25,30,150};
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int value=nums[i];
            if(value>max){
                max=value;
            }
        }
        System.out.print("max:" + max);
    }
}