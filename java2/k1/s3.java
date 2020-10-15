package k1;

interface A{
    int a=5;
    void f();
}


class B implements A{
    int number;
    public void f(){
        System.out.println("这是我第一次用接口的变量"+a);
        System.out.println("第二次用变量"+B.a);
        System.out.println("第三次用"+A.a);
    }
}


public class s3{
    public static void main(String[] args) {
        B b = new B();
        b.f();
        System.out.println("\n");
        System.out.println("第四次用"+(5+b.a));
    }
}