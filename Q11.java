import java.math.BigInteger;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Fcatorial Digit Sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println(getSum(n));
	}
	 private static long getSum(int n) 
	 {
	        BigInteger factorial = BigInteger.ONE;
	        for (int i = 2; i <= n; i++) 
	        {
	        	factorial = factorial.multiply(BigInteger.valueOf(i));
	        }
	        long res = 0;
	        while (factorial.compareTo(BigInteger.ZERO) > 0) 
	        {
	            res += factorial.mod(BigInteger.TEN).longValue();
	            factorial = factorial.divide(BigInteger.TEN);
	        }
	        return res;
	    }
}
