/*练习1.求1-100之间的所有偶数的和
2.求300以内的能被3整除而不能被7整除的数
3.输入一个数字，输出这个数字是一个几位数
4.输入一个数字，判断这个数字是否是一个质数（除1和本身以为，不能被其他的数字整除） 
 */
 import java.util.Scanner;
 
public class WhileDemo{
	public static void main(String[] args){
		/* //1---
		int num = 1;
		int sum = 0;
		while(num <= 100){
			if(num % 2 == 0)
			sum += num;
			num++;
		}
		System.out.println(sum); */
		
		/* //2---
		int num = 1;
		while(num <= 300){
			if(num%3 == 0 && num%7 != 0)
				System.out.println(num);
			
				num++;
		} */
		
		/* //3---
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int count = 0;
		while(i != 0){
			count++;
			i /= 10;
		}
		System.out.println(count); */
		
		//4---
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
	}
}