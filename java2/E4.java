

class UniversityStudent{
    int age;
    public void speak(){
        System.out.println("我是大学生");
    }
}

class Undergraduate extends UniversityStudent{
    public void supervisor(){
        age=20;
        System.out.println("我是本科生");
        System.out.println("我"+age+"岁，没有导师好可怜！");
    }
}

class Graduate extends UniversityStudent{
    public void supervisor(){
        age=24;
        System.out.println("我是研究生");
        System.out.println("我"+age+"岁，我有导师，我导师好厉害！");
    }
}

class PhDStudent extends Graduate{
    public void supervisor(){
        age=27;
        System.out.println("我是博士研究生");
        System.out.println("我"+age+"岁，我导师是二级教授，博士导师，好厉害啊！");
    }
}



public class E4 {
    public static void main(String args[]){
        UniversityStudent universityStudent=new UniversityStudent();
        universityStudent.speak();
        Undergraduate undergraduate=new Undergraduate();
        undergraduate.supervisor();
        Graduate graduate=new Graduate();
        graduate.supervisor();
        PhDStudent phDStudent=new PhDStudent();
        phDStudent.supervisor();
    }
}