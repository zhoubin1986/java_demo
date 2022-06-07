import java.util.Scanner;

public class MethodDemo2 {
	public static boolean JudgeCloseNumber(int x,int y){
		int num1 = 0;
		int num2 = 0;
		int[] arr1 = new int[x];
		int[] arr2 = new int[y];
		for(int i=1;i<x;i++){
			if(x%i == 0){
				arr1[i-1] = i;
				num1 += i;
				System.out.print(x + "-->" + arr1[i-1] + "\t");
			}
		}
		for(int j=1;j<y;j++){
			if(x%j == 0){
				num2 += j;
			}
		}
		if(num1 == num2){
			System.out.println();
			return true;
		}else{
			System.out.println();
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean b = JudgeCloseNumber(num1,num2);
		System.out.println(b);
	}
}