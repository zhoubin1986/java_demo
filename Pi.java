//PI = 4/1 - 4/3 + 4/5 - 4/7 + 4/9....

class Pi {
	public static void main(String[] args){
		//����һ��������pi
		double pi = 0;
		//����һ��������¼��ĸ
		double base = 1;
		int symbo = 1;
		int count = 0;
		while(pi < 3.1415926 || pi > 3.1415927){
			pi += symbo * 4/base;
			base += 2;
			symbo *= -1;
			count++;
		}
		System.out.println(count); 
	}
}