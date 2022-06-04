package packages1.bca3;
class Teacher {
    protected String name;
    protected int age;
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void teacherInfo() {
        System.out.println("Teacher name : " + name);
        System.out.println("Teacher age : " + age);
    }
}
public class Student extends Teacher{

    public  Student(String name, int age) {
        super(name, age);
    }
    public void studentInfo(){
        System.out.println("Student name = " + name);
        System.out.println("Student age = " + age);
    }
}
