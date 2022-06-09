//内存和传值

import java.util.Arrays;

public class MethodDemo7 {
	public static void main(String[] args){
		/* for(String str:args){
			System.out.println(str);
		} */
		/* int i = 10;
		changeVal(i);
		System.out.println(i);  //离开方法区就被释放了，如果要拿结果须有变量，用return --> int j = changeVal(i);
		 */
		 /* int arr1[] = new int[3];
		 int arr2[] = new int[8];
		 changeVal(arr1,arr2);
		 System.out.println(arr1.length);
		 System.out.println(arr2.length); */
		 
		 int[] arr = new int[3];
		 int[] temp = changeVal(arr);
		 arr = temp;
		 System.out.println(arr.length);
	}
	
	public static int[] changeVal(int[] ar){
		ar = Arrays.copyOf(ar,ar.length * 2);  //扩容本质上是改变了原来的地址
		return ar;
	}
	
	public static void changeVal(int[] arr1,int[] arr2){ //是在方法里交换的，离开后不存在了，除非return值
		int[] temp = arr1;  //必须是赋值给数组才行
		arr1 = arr2;
		arr2 = temp;
		System.out.println("-->" + arr1.length);
		System.out.println("-->" + arr2.length);
	
	}
	
	
	
	/* public static void changeVal(int i){
		i++;
	} */
}