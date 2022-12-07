import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Even-fibbonacci Number
		int n1=1,n2=2,sum=2,c=n1+n2;
		while(c<4000000)
		{
			n1=n2;
			n2=c;
			c=n1+n2;
			if(c%2==0)
			{
				sum=sum+c;
			}
		}
		System.out.println("Sum is"+" "+sum+".");
	}
}