class Day0312 {
	public static void main(String[] args){
		for(int i=0;i<33;i++){  //��������
			for(int j=0;j<50;j++){ //ĸ������
				int k = 100 - i -j; //С������
				if(3*i+2*j+k/3==100 && k % 3 == 0){  //ע��С��������3�ı���
					System.out.println("����������" + i);
					System.out.println("ĸ��������" + j);
					System.out.println("С��������" + k);
					System.out.println("----------------");
					
				}
			}
		}
	}
}