//练习：输入一个数字表示月份，第二个数字表示天数，然后输出这一天是这一年的第几天（不考虑闰年）

import java.util.Scanner;

public class SwitchCaseDemo1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个月份数：");
		int month = s.nextInt();
		System.out.println("请输入一个号数：");
		int day = s.nextInt();
		
		int temp = 0;
		switch(month){
			case 12: temp = (month - 1) * 31 - 7;break;
			case 11: 
			case 10: temp = (month - 1) * 31 - 6;break;
			case 9: 
			case 8: 
			case 7: temp = (month - 1) * 31 - 5;break;
			case 6: 
			case 5: temp = (month - 1) * 31 - 4;break;
			case 4: 
			case 3: temp = (month - 1) * 31 - 3;break;
			case 2: 
			case 1: temp = (month - 1) * 31;break;
			default: System.out.println("Illegal");
		}
		System.out.println("这是这一年中的第" + (temp + day) + "天");
		
	}
}