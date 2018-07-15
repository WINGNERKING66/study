package xxb.study;

public class StudyIf {
    public static void main(String[] args) {
        int i = 100;
        if(i < 50) {
            System.out.println("小于50");
        } else if(i <80) {
            System.out.println("大等于50小于80");
        }
        else if(i < 100) {
            System.out.println("大等于80小于100");
        }
        else {
            System.out.println("大等于100");
            System.out.println("结束");
        }
    }
}
