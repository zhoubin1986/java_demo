import java.util.Arrays;
public class BinarySearchDemo{
	public static void main(String[] args){
		//无序数组，进行元素出现的下标
		/* int[] arr = {10,2,11,3,5};
		int num = 2;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 2){
				System.out.println(i);
				break;
			}
		} */
		
		//有序数组（二分查找），进行元素出现的下标***需注意是有序数组
		/* 1  --->   n/2
		   2  --->   n/4
		   3  --->   n/8
		   ...
		   x  --->   1 = n/2^x
		   x = logn(折的次数)底数默认为2

		*/
		//时间复杂度O(logn),空间复杂度三个额外变量mid min max -->o(1)
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int num = 11;
		int min =0;  //数组下标
		int max = arr.length-1;
		int mid = (min + max)/2;
		while(arr[mid] != num && min<=max){  
			if(arr[mid] > num){
				max = mid - 1;
			}else{
				min = mid + 1;
			}
			//当出现找不到元素情况，如int num =11 ，会出现死循环
			/* if(min > max){  
				mid = -1;  //给一个值防止误解
				break;
			}  */
			mid = (min + max)/2;
		}
		System.out.println(mid);
	}
}