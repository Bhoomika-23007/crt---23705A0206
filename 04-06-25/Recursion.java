public class Recursion{
	public static void main(String[] args) {
	    printRange(1,5);
	}
	public static void printRange(int Start,int end){
	    if(Start>end){
	        return;
	    }
	    System.out.println(Start);
	    printRange(Start+1,end);
	}
}