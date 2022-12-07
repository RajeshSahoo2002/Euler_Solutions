import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Summation Of Primes
		int sum=0;
		for(int i=2;i<2000000;i++)
		{
			if(isprime(i))
			{
				sum=sum+i;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Sum is"+" "+sum+".");
	}
	public static boolean isprime(int num)
	{
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			else
			{
				continue;
			}
		}
		return true;
	}
}