import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:Sum square Difference
		int res1=0,res2=0;
		for(int i=0;i<=100;i++)
		{
			res1=res1+i*i;
		}
		for(int i=0;i<=100;i++)
		{
			res2=res2+i;
		}
		int ans=(int)Math.pow(res2,2);
		int difference=ans-res1;
		System.out.println("The difference is"+" "+difference+".");
	}
}