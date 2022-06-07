//哥德巴赫猜想

//1既不是质数也不是素数，2偶数（除了1和本身之外没有其他数能够被整除）
import java.util.Scanner;

public class MethodDemo1 {
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
		while(num < 6 || num%2 != 0){      //num%2 == 1
			num = sc.nextInt();
		} 
		
		for(int i=3;i<=num/2;i+=2){  //没有必要从2开始，++也没有必要直接+2 
			// boolean b1 = JudgePrimeNumber(i);
			// boolean b2 = JudgePrimeNumber(num-i);
			if(JudgePrimeNumber(i) && JudgePrimeNumber(num-i)){
				System.out.println(num + "=" + i + "+" + (num-i) );
			}
		}
		
	}
}