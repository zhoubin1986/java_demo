public class InputCorrect {
    public boolean Input(int year,int month,int day){
    Year a=new Year();
    boolean sign;    //用于判断输入正确或错误，并返回
        if(year<2010) {
            System.out.println("输入年份需大于等于2010");
            sign=false;
            year=2010; 
        }else sign=true;    //判断年份输入是否符合规范
        if(sign){
            if(month>12||month<1){
                System.out.println("输入月份不正确！");
                sign=false;
                month=1;
            }else sign=true;  //判断月份输入是否在1到12月份之间，不是则月份赋为1
        }
        int[] b={0,31,29,31,30,31,30,31,31,30,31,30,31}; //闰年月份的天数
        int[] c={0,31,28,31,30,31,30,31,31,30,31,30,31};  //平年月份的天数
        boolean leapyear1=a.judgeYear(year); //先判断当前年份是否闰年
        if(sign) {     //前面两步（年和月）输入都正确才会执行日的正确性判断
            if (leapyear1) {
                if (day <=b[month] && day >= 1) //是闰年，采用b数组
                    sign = true;
                else
                    sign = false;
            } else {
                if (day <= c[month] && day >= 1) //是平年，采用c数组
                    sign = true;
                else
                    sign = false;
            }
        }
        return sign;
    }
}
