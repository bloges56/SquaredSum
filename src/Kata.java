public class Kata
 {
  public static int squareSum(int[] n)
  { 
	   int sum = 0;
	   for(int i = 0; i < n.length; i++)
	   {
		 sum += (n[i] * n[i]);
	   }
	   return sum;
  }
  
  public static void main(String[] args) {
     int sum = Kata.squareSum(new int[] {1,2,2});
     System.out.println(sum);
     
  }

 }