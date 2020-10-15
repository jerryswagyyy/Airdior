
import java.util.*;


class MethodScanner{
    float sum1;
    MethodScanner(){}
    MethodScanner(String str){
        Scanner k1= new Scanner(str);
        k1.useDelimiter("[^0-9.]+");
        while(k1.hasNext()){
            try{
                float a= (float)k1.nextDouble();
                sum1=sum1+a;
            }
            catch(Exception e){
                String u= k1.next();
            }
        }
    }
    public float aver(){
        return sum1/3;
    }
    public float sum(){
        return sum1;
    }
}

class MethodStringTokenizer{
    double sum2;
    MethodStringTokenizer(){}
    MethodStringTokenizer(String str){
        String m1=("[^0-9.]+");
        //StringTokenizer k2=new StringTokenizer(str,m1);
		str=str.replaceAll(m1,"#");
        StringTokenizer k2=new StringTokenizer(str,"#");
        while(k2.hasMoreTokens()){
            String t1=k2.nextToken();
            double t2= Double.parseDouble(t1);
            sum2=sum2+t2;
        }
    }
    public double aver(){
        return sum2/3;
    }
    public double sum(){
        return sum2;
    }
}

public class E7 {
    public static void main(String[] args){
        Scanner m= new Scanner(System.in);
        String str = m.nextLine();
        MethodScanner methodOne = new MethodScanner(str); 
        MethodStringTokenizer methodTwo = new MethodStringTokenizer(str);
        System.out.println("String 类计算的总和为="+methodOne.sum()+"cm");
        System.out.println("String 类计算的平均值为="+methodOne.aver()+"cm");
        System.out.println("StringTokenizer 类计算的总和为="+methodTwo.sum()+"cm");
        System.out.println("StringTokenizer 类计算的平均值为="+methodTwo.aver()+"cm");
    }
}