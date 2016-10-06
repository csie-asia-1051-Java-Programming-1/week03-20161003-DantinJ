package hw;
import java.util.Scanner;
public class hw01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if (a > 0)
		{
			int sun = 0 ;
			while(a>0)
				{
				a = a/10;
				sun = sun+1;
				}
			System.out.print(sun);
		}
		else
		{
			System.out.print("error");
		}
	}

}
