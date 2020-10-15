
import java.util.Scanner;


class Cylinder1{
    Scanner m= new Scanner(System.in);
    int radius=m.nextInt();
    int heigh=m.nextInt();
    float s;
    float v;

    public void area(){
        s=(float)( radius*radius*3.14);
        System.out.println("圆柱1底面积为"+s);
    }
    public void volume(){
        v=(float)(s*heigh);
        System.out.println("圆柱1体积为"+v);
    }
}

class Cylinder2{
    float s2;
    float v2;
    Cylinder2(){}
    Cylinder2(int a,int b){
        s2=(float)(a*a*3.14);
        System.out.println("圆柱2底面积为"+s2);
        v2=s2*(float)b;
        System.out.println("圆柱2的体积为"+v2);
    }
}
public class E3 {
    public static void main(String args[]){
        Cylinder1 cylinder1 = new Cylinder1();
        cylinder1.area();
        cylinder1.volume();
        Cylinder2 cylinder2=new Cylinder2(1,100);
    }
}