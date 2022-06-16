class TestDemo {
	public static void main(String[] args){
		Outer:for(int i=1;i<3;i++){
			Inter:for(int j=1;j<3;j++){
				aa:if(j == 2){
					continue Outer;
				}
				System.out.println(i + "," + j);
			}
		}
	}
}