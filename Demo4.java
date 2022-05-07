import java.util.Scanner;

//练习：1.输入一个数字表示月份，输出月份所表示的季节；
//        3->5-Spring 6->8-Summer 9->11-Autumn 12->2-Winter
//      2.输入一个数字表示星期，然后输出这个星期所对应的英文
//        1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday

public class Demo4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		/* if(num >= 3 && num <= 5){    //if(num > 12 || num < 1)先排除错误输入可能
			System.out.println("Spring!");
		}else if(num >= 6 && num <= 8){
			System.out.println("Summer!");
		}else if(num >= 9 && num <= 11){
			System.out.println("Autumn!");
		}else if(num == 12 || (num >= 1 && num <= 2)){
			System.out.println("Winter!");
		}else{
			System.out.println("Err!");
		} */
		
		
		if(1 == num){
			System.out.println("Monday!");
		}else if(2 == num){
			System.out.println("Tuesday!");
		}else if(3 == num){
			System.out.println("Wednesday!");
		}else if(4 == num){
			System.out.println("Friday!");
		}else if(5 == num){
			System.out.println("Friday!");
		}else if(6 == num){
			System.out.println("Saturday!");
		}else if(7 == num){
			System.out.println("Sunday!");
		}else{
			System.out.println("Err!");
		}
	}
} 
