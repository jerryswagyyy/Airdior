
import java.util.Scanner;

abstract class Shape{
    abstract void perimeter();
    abstract void graphicType();
}

class Triangle extends Shape{
    int a;
    int b;
    int c;
    public void perimeter(){
        Scanner m=new Scanner(System.in);
        a=m.nextInt();
        b=m.nextInt();
        c=m.nextInt();
        if((a+b)>c&(a+c)>b&(b+c)>a){
            int z=a+b+c;
            System.out.println("�������ܳ�Ϊ"+z);
        }
        else{
            System.out.println("�����ˣ�����������");
            a=m.nextInt();
            b=m.nextInt();
            c=m.nextInt();
            int z=a+b+c;
            System.out.println("�������ܳ�Ϊ"+z);
        }
    }
    public void graphicType(){
        System.out.println("����ͼ��Ϊ������");
    }
}

class Circle extends Shape{
    public void perimeter(){
        Scanner m= new Scanner(System.in);
        int r= m.nextInt();
        //double r2=(int)3.14*2*r;
        System.out.println("Բ�ε��ܳ�Ϊ"+(double)(Math.PI*2*r));
    }
    public void graphicType(){
        System.out.println("����ͼ��ΪԲ��");
    }
}

public class E6 {
    public static void main(String[] args){
        Shape shape1=new Triangle();
        Shape shape2=new Circle();
        System.out.println("������ͼ������");
        Scanner k= new Scanner(System.in);
        String str= k.nextLine();
        if(str.equals("Բ��")){
            shape2.graphicType();
            shape2.perimeter();
        }
        else if(str.equals("������")){
            shape1.graphicType();
            shape1.perimeter();
        }
    }
}