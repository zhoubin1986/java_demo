import java.util.Scanner;

public class WhileForDemo{
	public static void main(String[] args){
		System.out.println("请输入一个大于10的偶数：");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = 0;
		
		 while(num <= 10 || num%2 != 0){
			num = s.nextInt();   //while-->不规律变化/次数不固定场合
			temp = num + 3;
		}
		System.out.println(num); 
		/* for(int i=0;i<3;i++){
			temp += i;
		}
		System.out.println(i);  //while中的num可以，for中的i是不行的 */
	}
}