

class UniversityStudent{
    int age;
    public void speak(){
        System.out.println("���Ǵ�ѧ��");
    }
}

class Undergraduate extends UniversityStudent{
    public void supervisor(){
        age=20;
        System.out.println("���Ǳ�����");
        System.out.println("��"+age+"�꣬û�е�ʦ�ÿ�����");
    }
}

class Graduate extends UniversityStudent{
    public void supervisor(){
        age=24;
        System.out.println("�����о���");
        System.out.println("��"+age+"�꣬���е�ʦ���ҵ�ʦ��������");
    }
}

class PhDStudent extends Graduate{
    public void supervisor(){
        age=27;
        System.out.println("���ǲ�ʿ�о���");
        System.out.println("��"+age+"�꣬�ҵ�ʦ�Ƕ������ڣ���ʿ��ʦ������������");
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