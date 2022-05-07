import java.util.Scanner;
/* 输入一个数字表示年份，输出一年是否是闰年：如果不是百年，则被4整除；如果是百年，则需要被400整除 */
public class Demo3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.println("请输入一个年份：");
		//int i = s.nextInt();
		System.out.println("请输入一个分数：");
		int score = s.nextInt();
		
		
		//1----
		 /* if(0 == i % 100){
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
		}  */
		
		//2-----
		/* if(0 != i % 100){
			if(0 == i % 4){
				System.out.println(i + "是闰年");
			}else{
				System.out.println(i + "是平年");
			}
		}else{
			if(0 == i % 400){
				System.out.println(i + "是闰年");
			}else{
				System.out.println(i + "是平年");
			}
		} */
		
		//3-----
		/* boolean b1 = i % 100 != 0 && i % 4 == 0;//是闰年情况，关键在于是否是百年
		boolean b2 = i % 100 == 0 && i % 400 == 0;//是闰年情况
		if(b1 || b2){
			System.out.println(i + "是闰年");
		}else{
			System.out.println(i + "是平年");
		} */
		
		//3-----
       /*  if(i % 100 != 0 && i % 4 == 0 || i % 400 == 0){      //去掉 i % 100 == 0  eg:1900 少算一步
			System.out.println(i + "是闰年");
		}else{
			System.out.println(i + "是平年");
		} */
		
		//4-----   if-else-if结构
		if(score >= 90){
			System.out.println("Level A");
		}else if(score >= 80){
			System.out.println("Level B");
		}else if(score >= 70){
			System.out.println("Level C");
		}else if(score >= 60){
			System.out.println("Level D");
		}else{
			System.out.println("Level E");
		}
	}
}