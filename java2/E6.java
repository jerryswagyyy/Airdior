
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
            System.out.println("三角形周长为"+z);
        }
        else{
            System.out.println("出错了，请重新输入");
            a=m.nextInt();
            b=m.nextInt();
            c=m.nextInt();
            int z=a+b+c;
            System.out.println("三角形周长为"+z);
        }
    }
    public void graphicType(){
        System.out.println("输入图形为三角形");
    }
}

class Circle extends Shape{
    public void perimeter(){
        Scanner m= new Scanner(System.in);
        int r= m.nextInt();
        //double r2=(int)3.14*2*r;
        System.out.println("圆形的周长为"+(double)(Math.PI*2*r));
    }
    public void graphicType(){
        System.out.println("输入图形为圆形");
    }
}

public class E6 {
    public static void main(String[] args){
        Shape shape1=new Triangle();
        Shape shape2=new Circle();
        System.out.println("请输入图形名字");
        Scanner k= new Scanner(System.in);
        String str= k.nextLine();
        if(str.equals("圆形")){
            shape2.graphicType();
            shape2.perimeter();
        }
        else if(str.equals("三角形")){
            shape1.graphicType();
            shape1.perimeter();
        }
    }
}