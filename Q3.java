import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Largest Prime Factor
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long n=sc.nextLong();
		ArrayList<Long> a=new ArrayList<Long>();
		for(long i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a.add(i);
				n=n/i;
			}
		}
		if(n>2)
		{
			a.add(n);
		}
		long max=Integer.MIN_VALUE;
		for(int i=0;i<a.size();i++)
		{
			max=Math.max(max,a.get(i));
		}
		System.out.println("Largest prime factor is"+" "+max+".");
	}
}