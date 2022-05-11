import java.util.Scanner;

public class SwitchCaseDemo{
	public static void main(String[] args){
		/* Scanner s = new Scanner(System.in);
		int num = s.nextInt(); */
		
		//1-----
		/* switch(num){
			case 1: System.out.println("Monday");break;
			case 2: System.out.println("Tuesday");break;
			case 3: System.out.println("Wednesday");break;
			case 4: System.out.println("Thursday");break;
			case 5: System.out.println("Friday");break;
			case 6: System.out.println("Saturday");break;
			case 7: System.out.println("Sunday");break;
			default : System.out.println("Illegal");break;
		} */
		
		//2----
		/* String str = "";
		switch(num){
			case 1: str = "Monday";break;
			case 2: str = "Tuesday";break;
			case 3: str = "Wednesday";break;
			case 4: str = "Thursday";break;
			case 5: str = "Friday";break;
			case 6: str = "Saturday";break;
			case 7: str = "Sunday";break;
			default: str = "Illegal";break;
		}
		System.out.println(str); */
		
		//练习：输入两个数字和一个符号(+-*/)，然后根据输入的符合对数字进行运算
		//1-----
		System.out.println("请输入两个数：");
		Scanner s = new Scanner(System.in);  //new一次就可以了，不要重复new
		double a1 = s.nextDouble();
		double a2 = s.nextDouble();
		
		System.out.println("请输入符号：");
		double temp = 0;
		char c = s.next().charAt(0);     //获取单个字符的方法，java中只有整数、小数和字符串三种。单个字符获取，其中没有这种获取方式：nextChar()
		switch(c){
			case '+': temp = a1 + a2;break;
			case '-': temp = a1 - a2;break;
			case '*': temp = a1 * a2;break;
			case '/': temp = a1 / a2;break;
			default : System.out.println("Illegal");break;
		}
		System.out.println("" + a1 + "" + c + "" + a2 + "=" + temp);  //输出数字方法，用字符串拼接  
		
		/* //2-----
		System.out.println("请输入两个数：");
		Scanner s = new Scanner(System.in);  
		double a1 = s.nextDouble();
		double a2 = s.nextDouble();
		
		System.out.println("请输入符号：");
		double temp = 0;
		String str = s.next();  
		switch(str){
			case "+": temp = a1 + a2;break;
			case "-": temp = a1 - a2;break;
			case "*": temp = a1 * a2;break;
			case "/": temp = a1 / a2;break;
			default : System.out.println("Illegal");break;
		}
		System.out.println("" + a1 + "" + str + "" + a2 + "=" + temp);   */
		/*  
		//输入一个月份，表示多少天
		//case后面没有跟break的特殊用法
		int month = 3;
		int day = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: day = 31;break;
			case 4:
			case 6:
			case 9:
			case 11: day = 30;break;
			case 2: day = 28;break;
		}
		*/
		//练习：
	}
}