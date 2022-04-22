public class Demo{
	public static void main(String[] args){
		//我  Utf-16编码
		int i = 100;
		float f = i;
		System.out.println("\u9999");  //u->utf16
		System.out.println(f);
		long m = 790L;
		float n = m;    
		System.out.println(n);
		
		//short s = 'a';
		//char c = s;
		//System.out.println(c);
		
		//char s = 'a';
		//short c = s;
		//System.out.println(c);
		
		
		//System.out.println(3 / 0);  //-->err
		System.out.println(3.0 / 0);  //-->infinity
		System.out.println(3.0 / 0.0); //-->infinity
		System.out.println(3 / 0.0); //-->infinity
		System.out.println(0.0 / 0);  //-->NaN
		//System.out.println(0 / 0);  //-->err
		System.out.println(0.0 / 0.0); //-->NaN
		System.out.println(0 / 0.0);  //-->NaN
		
		System.out.println(-14 % 4); //-->-2
		System.out.println(14 % -4); //-->2
		System.out.println(-14 % -4); //-->-2  以被除数符合为准
		System.out.println(3.8 % 1.2); //-->0.2(0.1999999...)计算机中允许的，余0.2
		
		int k = 5;
		//int j = ++k * 2;  //--> 等号运算符优先级最低，先看除了等号还有没其他运算符
		int j = k++ * 2;
		System.out.println(j);
		System.out.println(k);
		
		int k1 = 5;
		//int j1 = ++k1 * k1++;
		int j1 = k1++ * ++k1 + k1++;  //顺序
		System.out.println(k1);
		System.out.println(j1);    

		byte b0 = 10;
		b0++;
		System.out.println(b0);  //能够实现，底层实现
		
		byte b = 3 + 5;
		System.out.println(b);
		
		// byte b1 = 3;
		// byte b2 = 5;
		// byte b3 = b1 + b2;
		// System.out.println(b3);
		
		byte b1 = 3;
		b1 = b1 + 5;
		System.out.println(b1);
	}
}