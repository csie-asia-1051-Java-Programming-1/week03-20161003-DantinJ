package hw;
import java.util.Scanner;
public class hw05_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		for(int z=1;z<=n;z++)
		{
			a = z*(z+1)+a;
		}
		System.out.print(a);
	}

}
