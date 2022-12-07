import java.lang.*;
public class Q7
{
	//Question:10001st Prime
		public static void main(String[] args)
		{
		       System.out.println("Answer is:"+" "+nthPrime(10001)+".");
		}
		public static boolean isPrime(long n)
	    {
	        if(n == 1)
	        	return false;
	        if(n==2 || n == 3)
	        	return true;
	        if(n%2==0|| n%3 == 0)
	        	return false;
	        for(int i = 5;i*i<=n;i++)
	        {
	        	if(n % i == 0 || n % (i+2)==0)
	        		return false;
	        }
	        return true;
	    }
	    public static long nthPrime(long n) 
	    {
	        int numberOfPrimes = 0;
	        long prime = 1;
	        
	        while (numberOfPrimes < n) {
	            prime++;
	            if (isPrime(prime)) {
	                numberOfPrimes++;
	            }
	        }
	        return prime;
	    }
}