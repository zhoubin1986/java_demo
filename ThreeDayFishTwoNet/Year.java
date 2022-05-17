public class Year {
    public boolean judgeYear(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            return true;//是闰年返回true
        }else{
            return false;//非闰年返回false
        }
    }
}
