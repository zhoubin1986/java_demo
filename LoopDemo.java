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
		/* for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		} */
		
		/* 
			*
		   ***
		  *****
		 *******
		  *****
		   ***
		    *
		*/
		
		//1---
		/* public class LingXingDemo{
			public static void main(String[] args) {
				//控制菱形的行数（必须为奇数）
				int row = 9;
				for (int i = 1; i <= row / 2 + 1; i++) {//控制上半部分的行数
					for (int j = 1; j <= row / 2 + 1 - i; j++) {//控制" "的数量，只管从左边开始的空格
						System.out.print(" ");
					}
					for (int k = 1; k <= 2 * i - 1; k++) {//控制" "的数量
						System.out.print("*");
					}
					//进行换行
					System.out.println();
				}
				for (int i = row / 2; i >= 1; i--) {//控制下半部分的行数
					for (int j = 1; j <= row / 2 + 1 - i; j++) {//控制" "的数量，只管从左边开始的空格
						System.out.print(" ");
					}
					for (int k = 1; k <= 2 * i - 1; k++) {//控制" "的数量
						System.out.print("*");
					}
					System.out.println();
				}
			}
		} */
		
		//2---
		/* public class LingXing { //类

			public static void main(String[] args) {  //main方法
				lingxingPrint(5);//调用 打印菱形方法
			}
			public static void lingxingPrint(int line) { //打印菱形方法
				int x,y;//x轴 y轴//用数学图形方法，将菱形所构成的四边形画出来
				
				for (x = -line/2; x <= line/2; x++) { //控制行数
					for (y = line/2; y >= -line/2; y--) {
					   if ((x>0?x:-x)+(y>0?y:-y) <= line/2) {// “ 判断语句 ?   判断语句为true执行此处 : 判断语句为false 执行此处”三目运算符
							System.out.print("*");//打印 “*”
						} else
						System.out.print(" ");//打印 “空格”
					}
					System.out.print("\n");//或System.out.println();//这两个都表示换行
				}
			}
		}
 */
		
		/*
			**     **
		   ****   ****
          *************
		   ***********
			*********
			 *******
			  *****
			   ***
			    *
		*/
		for(int i=0,k=0;i<9;i++){    //不要写成int i=0,int k=0会报错
			if(i < 2){  //0 、 1  行
				for(int j=0;j<2-i;j++){
					System.out.print(" ");
				}
				for(int j=0;j<2+2*i;j++){
					System.out.print("*");
				}for(int j=0;j<5-2*i;j++){
					System.out.print(" ");
				}
				for(int j=0;j<2+2*i;j++){
					System.out.print("*");
				}
			}else if(i == 2){
				for(int j=0;j<13;j++){
					System.out.print("*");
				}
			}else{
				for(int j=0;j<k+1;j++){
					System.out.print(" ");
				}
				for(int j=0;j<13-2*(k+1);j++){
					System.out.print("*");
				}
				k++;
			}
			System.out.println();
		}
		
		//1---
		// 分三个大部分 上（从左开始观察空格数量和*号数量规律）中（三行一样）下（从左往右观察空格数量和*号数量规律）
		for (int i = 0, k = 0; i < 14; i++) {// 打印行
			// 上部分 上分为 四个部分
			if (i < 3) {
				for (int j = 0; j < 5 - 2 * i; j++) {// 1、空心
					System.out.print(" ");
				}
				if (i == 2) {// 2、*
					for (int j = 0; j < 6 + 4 * i - 1; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < 7 - 4 * i + 2; j++) {// 3、空心
						System.out.print(" ");
					}
					for (int j = 0; j < 6 + 4 * i - 1; j++) {// 4、*
						System.out.print("*");
					}
				} else {
					for (int j = 0; j < 6 + 4 * i; j++) {// 2、*
						System.out.print("*");
					}
					for (int j = 0; j < 7 - 4 * i; j++) {// 3、空心
						System.out.print(" ");
					}
					for (int j = 0; j < 6 + 4 * i; j++) {// 4、*
						System.out.print("*");
					}
				}
			} else if (i < 6) {// 中间
				for (int j = 0; j < 29; j++) {
					System.out.print("*");
				}
			} else {// 下部分 6
				if (i == 13) {
					for (int j = 0; j < 2 * (i - 6); j++) {// 打印空格
						System.out.print(" ");
					}
					System.out.print("*");
				} else {
					for (int j = 0; j < 2 * (i - 6) + 1; j++) {// 打印空格
						System.out.print(" ");
					}
					for (int j = 1; j < 28 - 4 * k; j++) {
						System.out.print("*");
					}
					k++;
				}
			}
			System.out.println();// 换行
		}
		
		
		//2---
		/* int x = 0, y = 0;

		double result = 0, m = 0, n = 0, j = 0, k = 0;

		int[][] a = new int[80][30];

		for (y = 0; y < 30; ++y) {

			for (x = 0; x < 80; ++x) {

				if (y <= 7 & x <= 40) {

				j = (7.0 - y) / 6.0;

				k = (40.0 - x) / 16.0 - 1;

				m = Math.pow(j, 2);

				n = Math.pow(k, 2);

				result = m + n;

				if (result > 1) {

				a[x][y] = 1;

				} else {

				a[x][y] = 0;

				}

				}

				if (y <= 7 & x > 40) {

				j = (7.0 - y) / 6.0;

				k = (x - 40.0) / 16.0 - 1;

				m = Math.pow(j, 2);

				n = Math.pow(k, 2);

				result = m + n;

				if (result > 1) {

				a[x][y] = 1;

				} else {

				a[x][y] = 0;

				}

				}

				if (y > 7 & x <= 40) {

				j = (7.0 - y) / 18.0;

				k = (40.0 - x) / 32.0;

				m = Math.pow(j, 2);

				n = Math.pow(k, 0.5);

				result = m + n;

				if (result > 1) {

				a[x][y] = 1;

				} else {

				a[x][y] = 0;

				}

				}

				if (y > 7 & x > 40) {

				j = (7.0 - y) / 18.0;

				k = (x - 40.0) / 32.0;

				m = Math.pow(j, 2);

				n = Math.pow(k, 0.5);

				result = m + n;

				if (result > 1) {

				a[x][y] = 1;

				} else {

				a[x][y] = 0;

				}

				}

				}

				}

				for (y = 0; y < 25; ++y) {

				for (x = 0; x < 80; ++x) {

				System.out.print(a[x][y]);

				}

				System.out.println();

				}
 */


	}   
}
		