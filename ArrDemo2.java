public class ArrDemo2 {
	public static void main(String[] args){
		//一个数组 a[99] ,里面有1-100中的99个不重复的整数,让你用最多一次循环找出没有放进去的那个数
		int[] arr = new int[99];
		//int sum = 5050;
		for(int i=0;i<arr.length;i++){  //for(int i=1;i<100;i++){sum += i - arr[i-1]; } sum += 100                                  
			sum += i;
		}
		for(int i：arr){
			sum -= i;
		}
		System.out.println(sum);
		
		/* 
		已知一个整数数组，除了一个元素只出现了奇数次，其他元素均出现偶数次。在O(n)的时间与常量空间范围内找出这个数字。
		一个简单地办法就是两层循环。外部循环逐一选择元素，内部循环计数被选择的元素出现的次数。这个方法的实践复杂度是O(n2)。

		更好一点的方法用哈希法。利用数组元素作为key，元素出现的次数作为value。建立一个空的哈希表，逐一遍历已知数组中的元素，并保存出现的次数。这个方法的实践复杂度是O(n)，但是它需要额外的空间用于哈希。

		最好的方法就是用XOR对所有的元素作位操作。所以元素做XOR操作可以得到出现奇数次的元素。请注意如果两个元素相同，那么这两个元素的XOR的结果是0，x与0的XOR的结果是x。
		
		a ^ a = 0; 0 ^ b = b;如果一个数字出现了偶数次，那么异或结果一定为0,满足交换律和结合律 a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
		*/
class OddOccurance {
	int getOddOccurrence(int ar[], int ar_size){
	int i;
	int res = 0;
	for (i = 0; i < ar_size; i++){
		res ^= ar[i];
	}
	return res;
	}

	public static void main(String[] args){
		OddOccurance occur = new OddOccurance();
		int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int n = ar.length;
		System.out.println(occur.getOddOccurrence(ar, n))；
	}
}