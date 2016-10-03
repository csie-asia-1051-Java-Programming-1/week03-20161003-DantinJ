package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */

public class ex03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char val = scn.next().charAt(0);
		if(val >=65 && val<=90)
		{
			System.out.println((char)((int)val+32));
		}
		else if(97<=val && val<=122)
		{
			System.out.println((char)((int)val-32));
		}
	}

}
