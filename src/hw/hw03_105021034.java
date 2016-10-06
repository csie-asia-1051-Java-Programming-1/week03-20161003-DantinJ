package hw;
import java.util.Scanner;
public class hw03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int n = a;
		for(int x=a;x>1;x--)
		{
			n=n*(x-1);	
		}
		System.out.println(n);
	}

}
