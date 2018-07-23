package xxb.study;
        //方法的重写
class Person {
            private String name;
            private int age;

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public String  getInf() {
                return "name:" + name + "\n" + "age:" + age;
            }
        }
class Student extends Person {
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public String  getInf() {
        return "name:" + getName() + "\n" + "age:" +  getAge() + "\n" + "school:" + school;
    }
}
public class TestOverWirte {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        p.setName("lishan");
        p.setAge(20);
        s.setAge(22);
        s.setName("zhangsan");
        s.setSchool("希望大学");
        System.out.print(p.getAge());
        System.out.print(p.getName());
        System.out.println(s.getSchool());
        System.out.println(p.getInf());

        System.out.println(s.getInf());


    }
}



