package hw;
import java.util.Scanner;
public class hw04_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int z = 0;
		int a = n;
		while(n>1)
		{
			a=a*(n-1);
			n--;
		}
		System.out.println(a);
	}

}
