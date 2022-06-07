/*
1.判断一个数是否是一个质数---明确返回值-->boolean，明确是否需要传入参数
2.哥德巴赫猜想：任何一个大于6的偶数可以分解成2个质数之和
18 = 7+11
24 = 7+17
24 = 11+13
输入一个数字，输出他的所有分解形式
3.亲密数：A的所有因子（含1不含本身）之和等于B，并且B的所有因子（含1不含本身）之和等于A，A和B就是一对亲密数
12 -->1,2,3,4,6  -->16
16-->1,2,4,8     --->15   不是亲密数  ，共同方法：求一个数的所有因子之和
 */
 
 /* //1--
import java.util.Scanner;
public class MethodDemo {
	public static boolean JudgePrimeNumber(int x){
		if(x<=1){
			return false;
		}
		int k = (int)Math.sqrt(x);  
		for(int i=2;i<=k;i++){
			if(x%i == 0)
				return false;	
		}
			return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = JudgePrimeNumber(num);
		System.out.println(b);
	}
} */


