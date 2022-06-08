//递归实现1->n的和，阶乘


public class MethodDemo5 {
	public static void main(String[] args){
		//System.out.println(sum(100));  //打印返回值
		System.out.println(factNum(5));
	}
	
	/* public static int sum(int n) {
		
		if(n == 1){
			return 1;   //结束标志，不加会无穷递归下去
		} 
		
		return n + sum(n-1);  //有返回值最后return..
	} */
	
	public static long factNum(int n) {
		
		if(n == 0){
			return 1;  
		} 
		
		return n*factNum(n-1);  
	}
}