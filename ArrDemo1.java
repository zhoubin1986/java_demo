import java.util.Arrays;

public class ArrDemo1{
	public static void main(String[] args){
		int[] arr = {-1,2,30,2,5,11};
		/* int max = arr[0];
		for(int i =1;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max); */
		
		/* int max = 0; 
		for(int i=1;i<arr.length;i++){
			if(arr[i] > arr[max]){
				max = i;
			}
		}
		System.out.println(max); */
		
		//从小到大排序:冒泡算法
		//1---
		/* for(int i=0;i<arr.length-1;i++){  //控制排序的总的轮数
			for(int j=0;j<arr.length-i-1;j++){  //每一轮总共需要几次排序
				if(arr[j+1] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int e:arr){
			System.out.println(e);
		} */
		//2---                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		/* for(int i=1;i<arr.length;i++){
			for(int j=1;j<=arr.length-i;j++){
				if(arr[j-1] < arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int e:arr){
			System.out.println(e);
		} */
		
		//选择排序
		/* for(int i=1;i<arr.length;i++){  //控制轮数和元素的下标
			for(int j=i;j<arr.length;j++){ //控制每一轮要比较元素的下标
				if(arr[i - 1] > arr[j]){  //相同的元素不会交换，稳定的排序算法//把不成立条件先列出来                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
					int temp = arr[i-1];
					arr[i-1] = arr[j];
					arr[j] = temp;
				}
			}
		} */
		
		//利用JAVA原生类进行排序
		/* Arrays.sort(arr);    //只能按升序排序
		for(int e:arr){
			System.out.println(e);
		} */
		
		//定义一个新的数组来存储翻转后结果,时间复杂度O(n)，空间复杂度o(n)
		/* int[] arr2 = new int[arr.length];
		for(int i=0,j=arr.length-1;j>=0;i++,j--){  //arr2[4] = arr[0];
			arr2[j] = arr[i];  //arr[i] = arr2[j];
		}
		for(int e:arr2){
			System.out.print(e + " ");
		}  */
		
		//首尾互换，时间复杂度O(n)，空间复杂度o(1) --->常用，省空间
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int e:arr){
			System.out.print(e + " ");
		}
	}
}