

import java.util.Arrays;

interface ComputerAverage{
    public float Average(float x[]);
}

class Diving implements ComputerAverage{
    float sum;
    public float Average(float x[]){
        Arrays.sort(x);
        for(int i=1;i<x.length-1;i++){
            sum=sum+x[i];
        }
        return sum/(x.length-2);
    }
}

class School implements ComputerAverage{
    public float Average(float x[]){
        float sum1=0;
        for(int i=0;i<x.length;i++){
            sum1=sum1+x[i];
        }
        return sum1/(x.length);
    }
}

public class E8 {
    public static void main(String[] args){
        float a[]={9.89f,9.88f,9.99f,9.12f,9.69f,9.76f,8.97f};
        float b[]={89,56,78,90,100,77,56,45,36,79,98};
        Diving diving= new Diving();
        School school=new School();
        System.out.println("跳水平均成绩为"+(double)diving.Average(a));
        System.out.println("该班平均分为"+(double)school.Average(b));
    }
}