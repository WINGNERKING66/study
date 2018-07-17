package xxb.study;
// 构造函数和普通函数的区别
public class Dog {
    int age;
    int  wight;
    Dog(int _age, int _wight) {
        this.age = _age;
        this.wight = _wight;
        }
    public static void main(String[] args) {
        Dog tom = new Dog(2,6);
        System.out.println("tom的年纪:" + tom.age);
        System.out.println("tom的体重:" + tom.wight);
    }

}


