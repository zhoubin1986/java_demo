public class FishAndNet {
    public String judgeFish(int sum){
        int a=sum%5;   //总天数除5取余
        if(a>=1&&a<=3)
            return("打鱼");  //余数是1，2,3，则此人在打鱼
        else
            return("晒网");  //其余情况（余数为0和4），则在晒网
    }
}
