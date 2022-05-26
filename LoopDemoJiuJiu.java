public class LoopDemoJiuJiu{
	public static void main(String[] args){
		//用一层循环实现九九乘法表
		int i = 1;
		for(int j=1;j<=9;){
			System.out.print(i + "*" + j + "=" + i*j + "\t");
			if(i == j){
				System.out.println();
				i = 0;
				j++;
			}
			i++;
		}
	}
}