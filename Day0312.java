class Day0312 {
	public static void main(String[] args){
		for(int i=0;i<33;i++){  //公鸡数量
			for(int j=0;j<50;j++){ //母鸡数量
				int k = 100 - i -j; //小鸡数量
				if(3*i+2*j+k/3==100 && k % 3 == 0){  //注意小鸡数量是3的倍数
					System.out.println("公鸡数量：" + i);
					System.out.println("母鸡数量：" + j);
					System.out.println("小鸡数量：" + k);
					System.out.println("----------------");
					
				}
			}
		}
	}
}