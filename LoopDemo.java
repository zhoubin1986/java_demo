public class LoopDemo{
	public static void main(String[] args){
		/* for(int i=0;i<4;i++){            //控制行数
			for(int j=0;j<6;j++){
				System.out.print("*");
			}
				System.out.println();
		} */
		/* for(int i=0;i<4;i++){            //控制行数
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
				System.out.println();
		} */
		/* for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		} */
		
		/* 
		  ----*
		  ---**
		  --***   
		  -****
		  *****
		*/
		/* for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){  //*数等于行数
				System.out.print("*");
			}
			System.out.println();
		} */
		
		/* 
			*****
			-****
			--***
			---**
			----*
		*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}