public class Main {
    public static void main (String[] args) throws Exception {
        java.util.Scanner y=new java.util.Scanner(System.in);
        int year;
       	int month;
        int day;
        System.out.println("选择你要进行的输入方式:1.文件输入;2.手动输入");
        int wor= y.nextInt();
        ReadAndWrite rw=new ReadAndWrite();
        if(wor==1){ //采取文件输入
            String rnm=rw.fileRead();
            int cnm=Integer.parseInt(rnm);  //把一个字符串转换为整数进行计算
            year=cnm/10000;
            month=cnm%10000/100;
            day=cnm-(year*10000+month*100);
        }else{  //用户手动输入
            System.out.println("请输入年月日");
            year=y.nextInt();
            month=y.nextInt();
            day=y.nextInt(); 
        }
        String ss;  //ss为写入文件内容的字符串
        InputCorrect input=new InputCorrect();
        boolean we=input.Input(year,month,day);
        do{
        if(we){
            System.out.println("日期输入符合格式");
           // ss="日期输入符合格式";
        }else{
            System.out.println("日期输入不符要求，请重新输入:");
          //  ss="日期输入不符要求，请重新输入:";
            year=y.nextInt();
            month=y.nextInt();
            day=y.nextInt();
            we=input.Input(year,month,day);
        }
        }while(we==false);
        Year year1=new Year();
        MonthAndDay date=new MonthAndDay();
        boolean leapYear1=year1.judgeYear(year);
        if(leapYear1==true){
            System.out.println("闰年");
            ss="闰年\n";
        }
        else {
            System.out.println("非闰年");
            ss="非闰年\n";
        }
        System.out.println("你输入了："+year+"年"+month+"月"+day+"日");
        ss=ss+"你输入了："+year+"年"+month+"月"+day+"日\n";
        int d=date.judgeMonth(day,month,year,leapYear1);
        System.out.println("据2010年1月1日已过去"+d+"天");
        ss=ss+"据2010年1月1日已过去"+d+"天\n";
        FishAndNet x=new FishAndNet();
        String fish=x.judgeFish(d);
        System.out.println("这一天，你在"+fish);
        ss=ss+"这一天，你在"+fish;
      //  System.out.println(ss);
        rw.write(ss);  //将ss写入文件
    }
}
