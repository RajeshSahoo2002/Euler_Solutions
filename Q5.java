import java.util.*;
import java.lang.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Power digit sum
		int res=(int)Math.pow(2,1000);
		System.out.println("Result is"+" "+res+".");
		int sum=0,rem=0;
		while(res>0)
		{
			rem=res%10;
			sum=sum+rem;
			res=res/10;
		}
		System.out.println("Sum is"+" "+sum+".");
	}
}