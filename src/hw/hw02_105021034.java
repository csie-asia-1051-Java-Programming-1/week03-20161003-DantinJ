package hw;
import java.util.Scanner;
public class hw02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 1;
		int x = 0;
		int y = 0;
		int z = 0;
		while (a == 1)
		{
			System.out.print("��J�@�Ӿ��=");
			int b = scn.nextInt();
			if(b>0)
			{
				x=x+1;
			}
			else if(b==0)
			{
				y=y+1;
			}
			else if(b<0)
			{
				z=z+1;
			}
			System.out.print("�٭n�~���J��?(1=y/0=n)");
			int yn = scn.nextInt();
			if (yn == 0)
			{
				a = 0;
			}
		}
		System.out.print("����Ʀ�"+x+"��\n0��"+y+"��\n�t��Ʀ�"+z+"��");
	}

}
