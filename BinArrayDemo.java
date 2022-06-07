public class BinArrayDemo{
	public static void main(String[] args){
		// int[][] arr = new int[3][2];
		// System.out.println(arr);
		// System.out.println(arr[0]);
		
		//int[][] arr = new int[3][];      //也可以这样写int arr[][] = new int[3][];  int[] arr[] = new int[3][]; 
		                                //int[] x,y;  --->等价于：int[] x; int[] y;
										//int x[],y;  --->等价于：int x[] /int[] x;   ; int y;
										//int[] x[],y;--->等价于：int[] x[]; int[] y;
		// System.out.println(arr);   
		// System.out.println(arr[0]);
		//System.out.println(arr[0][0]); //.NullPointerException空指针异常
		
		//二维数组遍历
		/* //1---最普通
		int[][] arr = {{1,2},{3,4,5},{6,7,8,9},{0}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		} */
		//2---增强for循环遍历
		int[][] arr = {{1,2},{3,4,5},{6,7,8,9},{0}};
		for(int[] ii:arr){
			for(int i:ii){
				System.out.println(i);
			}
		}
	}
}