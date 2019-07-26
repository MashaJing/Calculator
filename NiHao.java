import java.util.*;
public class FirstSample
{
	
	public static void main(String[] args)
	{		Scanner in = new Scanner(System.in);
			System.out.print("Hello, User!\n Please, enter numbers:\na=");
			float a = in.nextFloat();	
			System.out.print("\nb=");
			float b = in.nextFloat();
			System.out.println("Enter action:\n1) +\n2) -\n3) *\n4) /\n");
			int opt = in.nextInt();				
			switch (opt)
		{
			case 1:
			System.out.println(a+b);
			break;
			case 2:		
			System.out.println(a-b);
			break;			
			case 3:
			System.out.println(a*b);
			break;
			case 4:
			System.out.println(a/b);
			break;
		}
	}
}
