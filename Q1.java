import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Multiples of 3 or 5
		int sum=0;
		for(int i=0;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
			else
			{
				continue;
			}
		}
		System.out.println("The sum is"+" "+sum+".");
	}
}