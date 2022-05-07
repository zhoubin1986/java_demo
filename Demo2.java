import java.util.Scanner;

public class Demo2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = s.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = s.nextInt();
		System.out.println("请输入第三个数：");
		int num3 = s.nextInt();
		
		//方法1
		/* int max;
		if(num1 > num2){
			max = num1;
		}else{
			max = num2;
		}
		if(max > num3){
			System.out.println("三个数中最大一个是：" + max);
		}else{
			System.out.println("三个数中最大一个是：" + num3);
		} */
		
		//方法2
		int min = num1;
		if(min > num2){
			min = num2;
		}
		if(min > num3){
			min = num3;
		}
		System.out.println("三个数中最小的一个是:" + min);
	}
}