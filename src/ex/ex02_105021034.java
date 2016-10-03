package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021034 周宇晟
 */

public class ex02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int v1 = ch1-'a';
		if (v1 >= 0 && 26 >= v1)
		{
			System.out.println("little");
		}
		else
		{
			v1 = ch1-'A';
			if (v1 >=0 && 26 >= v1)
			{
			System.out.println("Big");
			}
			else
			{
				System.out.println("else");
			}
			}
		
		{
			
		}
	}

}
