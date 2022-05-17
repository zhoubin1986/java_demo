public class MonthAndDay {
    public int judgeMonth(int currentDay,int currentMonth,int currentYear,boolean l){
        Year a=new Year();
        int sumDate=0;            //总天数，初始化为零
        int yearOld=currentYear-2010;   //经过的年数=当前年份-2010
        for(int i=0;i<yearOld;i++){
            if (a.judgeYear(2010+i))  //判断所经过的年份有没有闰年
                sumDate=sumDate+366; //若（当前年份-2010）中的年份是闰年，总天数+366
            else sumDate=sumDate+365;//若（当前年份-2010）中的年份不是闰年，总天数+365
        }
        int[] leapYear={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int[] noLeapYear={0,31,28,31,30,31,30,31,31,30,31,30,31};
		//定义闰年和非闰年月份天数的数组，这里将每个数组第一个数赋为零的原因是方便计算，将数组的下表号和月份保持一致
       // leapYear[]={31,29,31,30,31,30,31,31,30,31,30,31};
       if (a.judgeYear(currentYear)){
           for(int i=0;i<currentMonth;i++)
               sumDate=sumDate+leapYear[i]; //若是闰年，则用leapYear[]进行计算
       }else{
           for(int i=0;i<currentMonth;i++)
               sumDate=sumDate+noLeapYear[i];//若不是闰年，则用noLeapYear[]进行计算
       }
       sumDate=sumDate+currentDay;//之前计算的天数+当前的日
       return sumDate;//返回总天数
    }
}
