import java.util.Scanner;

public class YHSJ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num <= 0){
			num = sc.nextInt();   //У��������
		}  
		
		int[][] arr = new int[num][];
		
		for(int i=0;i<num;i++){  //i��j���������±�
			arr[i] = new int[i+1];  //�õ���i�к�Ը��н��г�ʼ��
			for(int j=0;j<=i;j++){
				if(j == 0 || j == i){  //��ͷ�ͽ�β����1
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}