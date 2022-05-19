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
		
		/*  //2---
		 int num = 1;
		while(num <= 20){
			if(num%3 == 0 && num%7 != 0)
				System.out.println(num);
			
				num++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		}   */
		//2-1---
		/* int i = 0;
		while(i <= 20){
			if(i % 7 != 0){
				System.out.println(i);
			}
			i +=3;
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
		
		/* //4---
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num > 2){
			for(int i=2;i<num;i++){
			  if(num%i == 0){
				System.out.println(num + "是合数");
				return;
			  }
		    }
		}else if(2 == num){
			System.out.println(num + "是质数");
			return;
		}
		System.out.println(num + "是质数"); */
		
		//4-1---
		int n = Integer.parseInt(args[0]);//monthIn=Integer.parseInt(args[0]);

										//Integer.parseInt(String)就是将String字符类型数据转换为Integer整型数据，args[0]就是输入参数中的第一个参数字符串。
										//Integer.parseInt(String)遇到一些不能被转换为整型的字符时，会抛出异常
										//args是入口函数main(String[] args)方法的参数，args是字符串数组，args[0]取出的数据就是字符串，Integer.parseInt可以把字符串转换为int(Integer)类型
										//这段程序运行时需要带参数运行的，否则会报,字符串只能是数字，且在范围内

		int k = (int)Math.sqrt(n);  //对称结构  1*100 2*50 4*25 5*20 10*10 ->...
		System.out.println(k);
		int i;
		for(i=2;i<=k;i++){
			if(n%i == 0){
				break;
			}
		}
		if(i>k){
			System.out.println(n + "是质数");
		}else{
			System.out.println(n + "是合数");  //只要超过平方根值还不能整除即为质数，否则为合数
		}
	}
}