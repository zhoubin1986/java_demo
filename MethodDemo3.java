//求3000以内的亲密数

public class MethodDemo3 {
	public static void main(String[] args){
		for(int a=1;a<=3000;a++){
			int b = sumAllFact(a);
			int temp = sumAllFact(b);
			if(temp == a && a < b){
				System.out.println(a + "," + b);
			}
		}
	}
	
	public static int sumAllFact(int num){  //传入一个数求所有因子之和
		int sum = 0;
		for(int i=1;i<=num/2;i++){
			if(num%i == 0){
				sum += i;
			}
		}
		return sum;          //两个方法在同一个类里面
	}
}