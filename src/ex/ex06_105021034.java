package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021034 周宇晟
 */

public class ex06_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float x = scn.nextFloat();
		float y = 0;
		if (x<-1)
		{
			System.out.println("y="+(3*x*x));
		}
		else if (-1<=x && x<=1)
		{
			System.out.println("y="+((x*x*x)+(3*x)-3));
		}
		else
		{
			System.out.println("y="+(2*x)+3);
		}
	}

}
