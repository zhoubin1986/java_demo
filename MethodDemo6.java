//递归应用---题目：10层台阶，每次迈1个或者2个台阶，一共有多少种方式？
/* 
f(10) = f(8) + f(9)
f(9) = f(7) + f(8)
...
f(3) = f(2) + f(1)
f(2) = 2
f(1) = 1

斐波那契数列：(0 1) 1 2 3 5 8 13 21 34 55...
 */

public class MethodDemo6 {
	public static void main(String[] args) {
		System.out.println(stepForm(9));
	}
	
	public static int stepForm(int n) {
		if(n == 2){
			return 2;
		}
		if(n == 1){
			return 1;
		}
		return stepForm(n-1) + stepForm(n-2);
	}
}