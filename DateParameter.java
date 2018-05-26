import java.util.*;

public class DateParameter
{
	public static void main(String args[])
	{
		printDateParam(null);
	}

	public static void printDateParam(Date dt)
	{
		String sdt = "" + dt;
		if (dt == null)
			System.out.println("1> ==null");
		if (sdt.equals(""))
			System.out.println("1> ");
		if (sdt.equals("null"))
			System.out.println("1> null");
	}
}
