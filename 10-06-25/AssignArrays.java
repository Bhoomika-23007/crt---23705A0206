import java.util.Arrays;
import java.util.Scanner;
class AssignArrays{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print(Arrays.toString(arr));
  }
}