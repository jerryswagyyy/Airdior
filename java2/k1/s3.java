package k1;

interface A{
    int a=5;
    void f();
}


class B implements A{
    int number;
    public void f(){
        System.out.println("�����ҵ�һ���ýӿڵı���"+a);
        System.out.println("�ڶ����ñ���"+B.a);
        System.out.println("��������"+A.a);
    }
}


public class s3{
    public static void main(String[] args) {
        B b = new B();
        b.f();
        System.out.println("\n");
        System.out.println("���Ĵ���"+(5+b.a));
    }
}