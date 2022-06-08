//方法重载

public class MethodDemo4 {
	public static void main(String[] args){
		sum(3,5);
	}
	
	public static double sum(int a,double b){
		return a+b;
	}
	
	public static double sum(double a,int b) {
		return a+b;
	}
	
	/* public static int sum(int a,int b){
		return a+b;
	} */
	
	//...尽量重载所有可能方法，避免出现方法匹配上的混乱
} 