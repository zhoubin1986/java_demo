import java.util.Scanner;
/* 输入一个数字表示年份，输出一年是否是闰年：如果不是百年，则被4整除；如果是百年，则需要被400整除 */
public class Demo3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int i = s.nextInt();
		
		if(0 == i % 100){
			if(0 == i % 400){
				System.out.println(i + "是闰年");
			}else{
				System.out.println(i + "是平年");
			}
		}
		else if(0 == i % 4){
			System.out.println(i + "是闰年");
		}
		else{
			System.out.println(i + "是平年");
		}
	}
}