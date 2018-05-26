import java.util.*;

public class NumArray
{
	public static void main(String args[]) 
	{
		String outVal = "";
		for (int i = 1;i <= 10; i++)	{
			if (i % 2 == 0)
				System.out.println(" " +  i + " " + " Even");
			else
				System.out.println(" " +  i + " " + " Odd");
		}
	}
}