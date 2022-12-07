import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Digit Factorials
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();
		int sum=0;
		for(int i=10;i<=limit;i++)
		{
			if(i==curious_no(i))
			{
				sum=sum+i;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Sum of all the curious numbers upto the given limit"+" "+limit+" "+"is"+" "+sum+" "+".");
	}
	public static int curious_no(int nums)
	{
		int sum=0,rem=0;
		while(nums>0)
		{
			rem=nums%10;
			sum=sum+fact(nums);
			nums=nums/10;
		}
		return sum;
	}
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
}