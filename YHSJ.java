import java.util.Scanner;

public class YHSJ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num <= 0){
			num = sc.nextInt();   //校验输入数
		}  
		
		int[][] arr = new int[num][];
		
		for(int i=0;i<num;i++){  //i和j都是数组下标
			arr[i] = new int[i+1];  //拿到第i行后对该行进行初始化
			for(int j=0;j<=i;j++){
				if(j == 0 || j == i){  //开头和结尾都是1
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}