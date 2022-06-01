import java.util.Arrays;
public class ArrayCopyDemo{
	public static void main(String[] args){
		
		// int[] arr1 = {11,22,33,44,55,66,77,88,99};
		// int[] arr2 = new int[5];
		//拷贝数组元素，从arr1的第3位复制3位数到arr2的第2位上
		//1---原始
		/* for(int i=3,j=2;i<6;i++,j++){
			arr[j] = arr[i];
		} */
		
		//2.原生库
		//arraycopy(要复制的数组，要复制的数组第几个元素，目标数组，目标数组第几个元素，复制的元素个数);
		//System.arraycopy(arr1,3,arr2,2,3);
		
		//3.数组扩容
		int[] arr = {11,22,33,44,55,66,77,88,100};
		/* int[] temp = new int[15];
		System.arraycopy(arr,0,temp,0,arr.length);
		arr = temp;//本质上是数组的负责，扩容后的数组的地址实际上发生了改变 加上判断 */
		
		arr = Arrays.copyOf(arr,15);//扩容和缩容arr = Arrays.copyOf(arr,3)，本质上是从底层做了判断
									//int len = temp.length > arr.length ?  arr.length : temp.length
									//System.arraycopy(arr,0,temp,0,len);等价于Arrays.copyOf();
		for(int e:arr){
			System.out.println(e);
		}
	}
}