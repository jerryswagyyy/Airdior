package k1;

class A {
    String a="aaaa";
    A(){
        System.out.println("我是父类的构造方法没有参数");
    }
    /*A(String a){
        this.a=a;
        System.out.println(a);
    }*/
}
class B extends A{
    B(int a){
        //super("你好");
        System.out.println("我是子类"+a);
    }
}

public class s1 {
    public static void main(String[] args) {
        A a= new A();
        System.out.println("下面开始执行子类");
        System.out.println("\n");
        B b =new B(11);
    }
}