//for循环练习 计算阶乘
public class StudyFor {
    public static void main(String[] args) {
       int f = 1;
       int result = 0;
       for(int i=1;i<=10;i++) {
           f = f * i;
           result += f;
       }
        System.out.println("1到10的阶乘为和:" + result);
    }
}
