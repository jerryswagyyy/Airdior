
import java.util.Scanner;

class A{
    float m=0.1f;
    public void f(){
        System.out.println("��1��Ĳ���Ϊ"+m);
        for(int i=0;i<29;i++){
            m=m*2;
            System.out.println("��"+(i+2)+"��Ĳ���Ϊ"+m);
        }
    }
}

class B{
    float m=0.1f;
    int i=0;
    public void f(){
        System.out.println("��1��Ĳ���Ϊ"+m);
        while(i<29){
            m=m*2;
            System.out.println("��"+(i+2)+"��Ĳ���Ϊ"+m);
            i++;
        }
    }
}


class C{
    float m =0.1f;
    int i=0;
    public void f(){
        System.out.println("��1��Ĳ���Ϊ"+m);
        do{
            m=m*2;
            System.out.println("��"+(i+2)+"��Ĳ���Ϊ"+m);
            i++;
        }while(i<29);
    }
}

class D{
    float n=0.1f;
    Scanner m=new Scanner(System.in);
    int k= m.nextInt();
    public void f(){
        for(int i=0;i<29;i++){
            n=n*2;
        }
        System.out.println(k+"���Ĳ���Ϊ"+n);
    }
}
public class E2{
    public static void main(String args[]){
        A a=new A();
        a.f();
        System.out.println("niubi");
        B b = new B();
        b.f();
        System.out.println("niubi");
        C c=new C();
        c.f();
        System.out.println("niubi");
        D d =new D();
        d.f();

    }
}