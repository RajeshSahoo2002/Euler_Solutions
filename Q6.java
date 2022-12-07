import java.util.*;
public class Q6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++)
        {
            for (int j = i + 1; j < 1000; j++)
            {
                double c1 = Math.pow(i, 2) + Math.pow(j, 2);
                double c = Math.sqrt(c1);
                if (i + j + c == 1000)
                {
                    System.out.println("Product is"+" "+i * j * c+".");
                    break;
                }
            }
        }
	}
}