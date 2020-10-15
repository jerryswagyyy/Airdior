

class A{
    public void shuchu(){
        for(int i=0;i<=25;i++){
            System.out.print((char)(97+i));
            System.out.print(' ');
        }
    }
}

class B{
    char a[]=new char[100];
    public void shuchu(){
        for(int i=0;i<=25;i++){
            a[i]=(char)('A'+i);
            System.out.print(a[i]);
            System.out.print(' ');
        }
    }
}

public class E1{
    public static void main(String[] args) {
        A a= new A();
        a.shuchu();
        System.out.print('\n');
        B b=new B();
        b.shuchu();
    }
} 