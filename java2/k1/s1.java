package k1;

class A {
    String a="aaaa";
    A(){
        System.out.println("���Ǹ���Ĺ��췽��û�в���");
    }
    /*A(String a){
        this.a=a;
        System.out.println(a);
    }*/
}
class B extends A{
    B(int a){
        //super("���");
        System.out.println("��������"+a);
    }
}

public class s1 {
    public static void main(String[] args) {
        A a= new A();
        System.out.println("���濪ʼִ������");
        System.out.println("\n");
        B b =new B(11);
    }
}