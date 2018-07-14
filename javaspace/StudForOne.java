//计算1到99的累加
public class StudForOne {
    public static void main(String[] args) {
        int f = 0;
        for(int i=1; i<=99; i+=2) {
            f += i;
        }
        System.out.println("1到99的累加数为:" + f);
    }
}
